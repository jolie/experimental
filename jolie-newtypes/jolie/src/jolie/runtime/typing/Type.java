/***************************************************************************
 *   Copyright (C) 2009-2011 by Fabrizio Montesi <famontesi@gmail.com>     *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/

package jolie.runtime.typing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import jolie.lang.Constants;
import jolie.lang.NativeType;
import jolie.runtime.Value;
import jolie.runtime.ValueVector;
import jolie.util.Range;

class TypeImpl extends Type
{
	private final Range cardinality;
	private final NativeType nativeType;
	private final Set< Entry< String, Type > > subTypeSet;
	private final Set< String > subTypeKeySet;

	public TypeImpl(
		NativeType nativeType,
		Range cardinality,
		boolean undefinedSubTypes,
		Map< String, Type > subTypes
	) {
		this.nativeType = nativeType;
		this.cardinality = cardinality;
		if ( undefinedSubTypes ) {
			subTypeSet = null;
			subTypeKeySet = null;
		} else {
			subTypeSet = subTypes.entrySet();
			subTypeKeySet = subTypes.keySet();
		}
	}
	
	protected Set< Entry< String, Type > > subTypeSet()
	{
		return subTypeSet;
	}

	protected Range cardinality()
	{
		return cardinality;
	}
	
	public void cutChildrenFromValue( Value value )
	{
		if ( subTypeKeySet != null ) {
			for( String childName : subTypeKeySet ) {
				value.children().remove( childName );
			}
		}
	}
	
	protected Value cast( Value value, StringBuilder pathBuilder )
			throws TypeCastingException
	{
		castNativeType( value, pathBuilder );
		if ( subTypeSet != null ) {
			for( Entry< String, Type > entry : subTypeSet ) {
				castSubType( entry.getKey(), entry.getValue(), value, new StringBuilder( pathBuilder ) );
			}
		}
		return value;
	}

	private void castSubType( String typeName, Type type, Value value, StringBuilder pathBuilder )
		throws TypeCastingException
	{
		pathBuilder.append( '.' );
		pathBuilder.append( typeName );

		boolean hasChildren = value.hasChildren( typeName );
		if ( hasChildren == false && type.cardinality().min() > 0 ) {
			throw new TypeCastingException( "Undefined required child node: " + pathBuilder.toString() );
		} else if ( hasChildren ) {
			ValueVector vector = value.getChildren( typeName );
			int size = vector.size();
			if ( type.cardinality().min() > size || type.cardinality().max() < size ) {
				throw new TypeCastingException(
					"Child node " + pathBuilder.toString() + " has a wrong number of occurencies. Permitted range is [" +
					type.cardinality().min() + "," + type.cardinality().max() + "], found " + size
				);
			}

			for( Value v : vector ) {
				type.cast( v, pathBuilder );
			}
		}	
	}

	protected void check( Value value, StringBuilder pathBuilder )
		throws TypeCheckingException
	{
		if ( checkNativeType( value, nativeType ) == false ) {
			throw new TypeCheckingException( "Invalid native type for node " + pathBuilder.toString() + ": expected " + nativeType + ", found " + (( value.valueObject() == null ) ? "void" : value.valueObject().getClass().getName()) );
		}

		if ( subTypeSet != null && subTypeSet.size() > 0 ) {
			for( Entry< String, Type > entry : subTypeSet ) {
				checkSubType( entry.getKey(), entry.getValue(), value, new StringBuilder( pathBuilder ) );
			}
			// TODO make this more performant
			for( String childName : value.children().keySet() ) {
				if ( isValueInSubTypes( childName ) == false ) {
					throw new TypeCheckingException( "Unexpected child node: " + pathBuilder.toString() + "." + childName );
				}
			}
		}
	}
	
	protected boolean isValueInSubTypes ( String childName )
	{
		if ( subTypeKeySet.contains( childName ) ) {
			return true;
		} else {
			if ( subTypeKeySet.contains( Constants.NO_ID ) ) {
				for ( Entry< String, Type >  entry : subTypeSet ) {
					if ( entry.getKey().equals( Constants.NO_ID ) ) {
						if ( entry.getValue().isValueInSubTypes( childName ) ) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}

	
	@Override
	protected void checkValueChildren(Value value, StringBuilder pathBuilder) throws TypeCheckingException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private void castNativeType( Value value, StringBuilder pathBuilder )
		throws TypeCastingException
	{
		if ( checkNativeType( value, nativeType ) == false ) {
			// ANY is not handled, because checkNativeType returns true for it anyway
			if ( nativeType == NativeType.DOUBLE ) {
				try {
					value.setValue( value.doubleValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else if ( nativeType == NativeType.INT ) {
				try {
					value.setValue( value.intValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else if ( nativeType == NativeType.LONG ) {
				try {
					value.setValue( value.longValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else if ( nativeType == NativeType.BOOL ) {
				try {
					value.setValue( value.boolValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else if ( nativeType == NativeType.STRING ) {
				try {
					value.setValue( value.strValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else if ( nativeType == NativeType.VOID ) {
				if ( value.valueObject() != null ) {
					throw new TypeCastingException(
						"Expected " + NativeType.VOID.id() + ", found " +
						value.valueObject().getClass().getSimpleName() +
						": " + pathBuilder.toString()
					);
				}
			} else if ( nativeType == NativeType.RAW ) {
				try {
					value.setValue( value.byteArrayValueStrict() );
				} catch( TypeCastingException e ) {
					throw new TypeCastingException( "Cannot cast node value to " + nativeType.id() + ": " + pathBuilder.toString() );
				}
			} else {
				throw new TypeCastingException(
					"Expected " + nativeType.id() + ", found " +
					value.valueObject().getClass().getSimpleName() +
					": " + pathBuilder.toString()
				);
			}
		}
	}

	private boolean checkNativeType( Value value, NativeType nativeType )
	{
		if ( nativeType == NativeType.ANY ) {
			return true;
		} else if ( nativeType == NativeType.DOUBLE ) {
			return value.isDouble() || value.isInt();
		} else if ( nativeType == NativeType.LONG ) {
			return value.isInt() || value.isLong();
		} else if ( nativeType == NativeType.BOOL ) {
			return value.isBool();
		} else if ( nativeType == NativeType.INT ) {
			return value.isInt();
		} else if ( nativeType == NativeType.STRING ) {
			return value.isString();
		} else if ( nativeType == NativeType.VOID ) {
			return value.valueObject() == null;
		} else if ( nativeType == NativeType.RAW ) {
			return value.isByteArray();
		}

		return false;
	}
	
	protected NativeType nativeType()
	{
		return nativeType;
	}
}


/**
 * Choice type
 * @author Julie Meinicke Nielsen
 */
class TypeChoice extends Type
{
	private final Range cardinality;
	private final List< Map< String, Type > > options; //An option consists of subtypes organized in a map
			
	
	public TypeChoice( Range cardinality, List< Map< String, Type > > options ) 
	{
		this.cardinality = cardinality;
		this.options = options;
	}

	/**
	 * Cut each option from value.
	 * @param value 
	 */
	@Override
	public void cutChildrenFromValue( Value value )
	{
		for ( Map< String, Type > option : options ) {
			for( Map.Entry< String, Type > entry : option.entrySet() ) {
				String typeName = entry.getKey();
				if ( typeName.equals( Constants.NO_ID ) ) {
					entry.getValue().cutChildrenFromValue( value );
				} else {
					value.children().remove( typeName );
				}
			}
		}	
	}

	@Override
	protected Range cardinality() 
	{
		return cardinality;
	}

	protected List< Map< String, Type > > options() 
	{
		return options;
	}

	/**
	 * Check if a value match at least one option.
	 * @param value
	 * @param pathBuilder
	 * @throws TypeCheckingException 
	 */
	@Override
	protected void check(Value value, StringBuilder pathBuilder) throws TypeCheckingException
	{
				
		boolean valueInWholeOption = false;
		boolean valueInOptionUntilNow;
		
		for (Map< String, Type > option : options ) {
			
			valueInOptionUntilNow = true;
			for( Entry< String, Type > entry : option.entrySet() ) {
				try {
					entry.getValue().check( value );
				} catch (TypeCheckingException ex) {
					valueInOptionUntilNow = false;
					break; //todo: fix
				}
			}
			if ( valueInOptionUntilNow ) {
				if ( valueInWholeOption ) { //check whether value's children matches more than one option
					throw new TypeCheckingException( pathBuilder.toString() + " only allows for one of its options to be completed." );
				}
					valueInWholeOption = true;
				}
		}
		if ( valueInWholeOption == false ) {//check whether value's children matches at least one option
			throw new TypeCheckingException( "Invalid type for node " + pathBuilder.toString() + ": couldn't match  " + value.valueObject().getClass().getName() + " in any of it's options" );
		}
	}

	/**
	 * Check a choice's children against a value's children.
	 * @param value
	 * @param pathBuilder
	 * @throws TypeCheckingException 
	 */
	protected void checkValueChildren( Value value, StringBuilder pathBuilder ) throws TypeCheckingException
	{
		
		boolean valueInWholeOption = false;
		boolean valueInOptionUntilNow;
		String typeName;
		Type type;
		
		
		for (Map< String, Type > option : options ) {
			
			valueInOptionUntilNow = true;
			for( Entry< String, Type > entry : option.entrySet() ) {
				typeName = entry.getKey();
				type = entry.getValue();
				try {
					type.checkSubType( typeName, type, value, pathBuilder );
				} catch (TypeCheckingException ex) {
					valueInOptionUntilNow = false;
					break; //todo: fix
				}
			}
			if ( valueInOptionUntilNow ) {
				if ( valueInWholeOption ) { //check whether value's children matches more than one option
					throw new TypeCheckingException( pathBuilder.toString() + " only allows for one of its options to be completed." );
				}
				valueInWholeOption = true;
			}
		}
		if ( valueInWholeOption == false ) {//check whether value's children matches at least one option
			throw new TypeCheckingException( "Invalid type for node " + pathBuilder.toString() + ": couldn't match  " + value.valueObject().getClass().getName() + " in any of it's options" );
		}
	}

	@Override
	protected boolean isValueInSubTypes ( String childName )
	{
		for ( Map< String, Type > option : options ) {
			
			if ( option.containsKey( childName ) ) {
				return true;
			} else {
				if ( option.containsKey( Constants.NO_ID ) ) {
					for ( Entry< String, Type >  entry : option.entrySet() ) {
						if ( entry.getKey().equals( Constants.NO_ID ) ) {
							if ( entry.getValue().isValueInSubTypes( childName ) ) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * Tries to cast the value to an option. Each option in each list of options is tried
	 * until a cast success. If non of the tries success the
	 * TypeCastingException from the last try is thrown.
	 * @param value
	 * @param pathBuilder
	 * @return casted value
	 * @throws TypeCastingException
	 */
	
	@Override
	protected Value cast(Value value, StringBuilder pathBuilder) throws TypeCastingException
	{
		TypeCastingException e0 = null;
		
		for( Map< String, Type > option : options ) {
			for( Entry< String, Type > entry : option.entrySet() ) {
				try {
					value = entry.getValue().cast( value, new StringBuilder( pathBuilder ) );
					return value;
				} catch ( TypeCastingException e1 ) {
					e0 = e1;
				}
			}
		}
		throw e0;
	}
}

/**
 *
 * @author Fabrizio Montesi
 */
public abstract class Type implements Cloneable
{
	public static final Type UNDEFINED =
		Type.create( NativeType.ANY, new Range( 0, Integer.MAX_VALUE ), true, null );

	public static Type create(
		NativeType nativeType,
		Range cardinality,
		boolean undefinedSubTypes,
		Map< String, Type > subTypes
	) {
		return new TypeImpl( nativeType, cardinality, undefinedSubTypes, subTypes );
	}
	
	public static Type create( Range cardinality, List< Map< String, Type > > options )
	{
		return new TypeChoice( cardinality, options ); 
	}

	public static TypeLink createLink( String linkedTypeName, Range cardinality )
	{
		return new TypeLink( linkedTypeName, cardinality );
	}

	public static Type merge( Type t1, Type t2 )
	{
		//TODO: Implement merge of choice types.
		if ( t1 instanceof TypeLink ) {
			if ( ( (TypeLink)t1 ).linkedType()  instanceof TypeChoice ) {
				throw new UnsupportedOperationException("Merging choice types: Not supported yet.");
			} else {
				t1 = ( (TypeLink)t1 ).linkedType();
			}
		}
		if ( t2 instanceof TypeLink ) {
			if ( ( (TypeLink)t2 ).linkedType()  instanceof TypeChoice ) {
				throw new UnsupportedOperationException("Merging choice types: Not supported yet.");
			} else {
				t2 = ( (TypeLink)t2 ).linkedType();
			}
		}		
		if ( t1 instanceof TypeChoice || t2 instanceof TypeChoice ) {
			throw new UnsupportedOperationException("Merging choice types: Not supported yet.");
			
		}
		
		TypeImpl t1Casted = (TypeImpl)t1;
		TypeImpl t2Casted = (TypeImpl)t2;
		
		NativeType nativeType = t1Casted.nativeType();
		Range cardinality = t1Casted.cardinality();
		Map< String, Type > subTypes = new HashMap< String, Type >();
		for( Entry< String, Type > entry : t1Casted.subTypeSet() ) {
			subTypes.put( entry.getKey(), entry.getValue() );
		}
		if ( t2 != null ) {
			for( Entry< String, Type > entry : t2Casted.subTypeSet() ) {
				subTypes.put( entry.getKey(), entry.getValue() );
			}
		}
		return create( nativeType, cardinality, false, subTypes );
	}
	
	public void check( Value value )
		throws TypeCheckingException
	{
		check( value, new StringBuilder( "#Message" ) );
	}

	protected void checkSubType( String typeName, Type type, Value value, StringBuilder pathBuilder )
			throws TypeCheckingException
	{
		if ( typeName.equals(Constants.NO_ID) ) {
			type.checkValueChildren( value, pathBuilder );
		} else {
			
			pathBuilder.append( '.' );
			pathBuilder.append( typeName );
			
			boolean hasChildren = value.hasChildren( typeName );
			if ( hasChildren == false && type.cardinality().min() > 0 ) {
				throw new TypeCheckingException( "Undefined required child node: " + pathBuilder.toString() );
			} else if ( hasChildren ) {
				ValueVector vector = value.getChildren( typeName );
				int size = vector.size();
				if ( type.cardinality().min() > size || type.cardinality().max() < size ) {
					throw new TypeCheckingException(
							"Child node " + pathBuilder.toString() + " has a wrong number of occurencies. Permitted range is [" +
							type.cardinality().min() + "," + type.cardinality().max() + "], found " + size
							);
				}
				
				for( Value v : vector ) {
					type.check( v, pathBuilder );
				}
			}
		}
	}

	public Value cast( Value value )
		throws TypeCastingException
	{
		return cast( value, new StringBuilder( "#Message" ) );
	}

	public abstract void cutChildrenFromValue( Value value );
	protected abstract Range cardinality();
	protected abstract void check( Value value, StringBuilder pathBuilder )
		throws TypeCheckingException;
	protected abstract void checkValueChildren( Value value, StringBuilder pathBuilder ) 
		throws TypeCheckingException;
	protected abstract boolean isValueInSubTypes ( String childName );
	protected abstract Value cast( Value value, StringBuilder pathBuilder )
		throws TypeCastingException;

	public static class TypeLink extends Type
	{
		private final String linkedTypeName;
		private final Range cardinality;
		private Type linkedType;

		public TypeLink( String linkedTypeName, Range cardinality )
		{
			this.linkedTypeName = linkedTypeName;
			this.cardinality = cardinality;
		}

		public String linkedTypeName()
		{
			return linkedTypeName;
		}

		public void setLinkedType( Type linkedType )
		{
			this.linkedType = linkedType;
		}
		
		public Type linkedType()
		{
			return this.linkedType;
		}
		
		public void cutChildrenFromValue( Value value )
		{
			linkedType.cutChildrenFromValue( value );
		}

		protected Range cardinality()
		{
			return cardinality;
		}

		protected void check( Value value, StringBuilder pathBuilder )
			throws TypeCheckingException
		{
			linkedType.check( value, pathBuilder );
		}

		@Override
		protected void checkValueChildren( Value value, StringBuilder pathBuilder ) throws TypeCheckingException 
		{
			linkedType.checkValueChildren( value, pathBuilder );
		}
		
		@Override
		protected boolean isValueInSubTypes( String childName ) 
		{
			return linkedType.isValueInSubTypes( childName );
		}
		
		protected Value cast( Value value, StringBuilder pathBuilder )
				throws TypeCastingException
		{
			return linkedType.cast( value, pathBuilder );
		}
	}
}