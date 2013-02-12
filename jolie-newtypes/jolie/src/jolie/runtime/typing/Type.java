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
import jolie.lang.NativeType;
import jolie.runtime.Value;
import jolie.runtime.ValueVector;
import jolie.util.Range;

class TypeImpl extends Type
{
	private final Range cardinality;
	private final NativeType nativeType;
	private final Set< Entry< String, List< Type > > > subTypeSet;
	private final Set< String > subTypeKeySet;

	public TypeImpl(
		NativeType nativeType,
		Range cardinality,
		boolean undefinedSubTypes,
		Map< String, List< Type > > subTypes
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
	
	protected Set< Entry< String, List< Type > > > subTypeSet()
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
			for( Entry< String, List< Type > > entry : subTypeSet ) {
				for ( Type type : entry.getValue() ) {
					castSubType( entry.getKey(), type, value, new StringBuilder( pathBuilder ) );
				}
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

		if ( subTypeSet != null ) {
			for( Entry< String, List< Type > > entry : subTypeSet ) {
				for( Type type : entry.getValue() ) {
					checkSubType( entry.getKey(), type, value, new StringBuilder( pathBuilder ) );
				}
			}
			// TODO make this more performant
			for( String childName : value.children().keySet() ) {
				if ( subTypeKeySet.contains( childName ) == false ) {
					throw new TypeCheckingException( "Unexpected child node: " + pathBuilder.toString() + "." + childName );
				}
			}
		}
	}

	private void checkSubType( String typeName, Type type, Value value, StringBuilder pathBuilder )
		throws TypeCheckingException
	{
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
	private final List < List < Type > > options;
	
	public TypeChoice( Range cardinality, List < List < Type > > options ) 
	{
		this.cardinality = cardinality;
		this.options = options;
	}
	
	@Override
	public void cutChildrenFromValue( Value value )
	{
		List < Type > option;
		
		for( int i=0; i < options.size(); i++ ) {
			option = options.get( i );
			
			for ( Type type : option ) {
				type.cutChildrenFromValue( value );
			}
		}
	}

	@Override
	protected Range cardinality() 
	{
		return cardinality;
	}

	protected List < List < Type > > options() 
	{
		return options;
	}
	
	@Override
	protected void check(Value value, StringBuilder pathBuilder) throws TypeCheckingException
	{
		boolean valueInOption = false;
		for( List < Type > option : options ) {
			for( Type type : option ) {
				valueInOption = checkOption( type, value, new StringBuilder( pathBuilder ) );
				if ( valueInOption == true ) {
					break;
				}
			}
		}
		if ( !valueInOption ) {
			throw new TypeCheckingException( "Undefined required node: " + pathBuilder.toString() );
		}
	}
	
	private boolean checkOption( Type type, Value value, StringBuilder pathBuilder )
			throws TypeCheckingException
	{
		try {
			type.check( value, pathBuilder );
		} catch (TypeCheckingException e) {
			System.out.println("Choice: check option received typeerror: " + e.getMessage() );	
			return false;
		}
		return true;
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
		
		for( List < Type > option : options ) {
			for( Type type : option ) {
				try {
					value = type.cast( value, new StringBuilder( pathBuilder ) );
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
		Map< String, List< Type > > subTypes
	) {
		return new TypeImpl( nativeType, cardinality, undefinedSubTypes, subTypes );
	}
	
	public static Type create( Range cardinality, List < List < Type > > options )
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
		Map< String, List< Type > > subTypes = new HashMap< String, List< Type > >();
		for( Entry< String, List< Type > > entry : t1Casted.subTypeSet() ) {
			subTypes.put( entry.getKey(), entry.getValue() );
		}
		if ( t2 != null ) {
			for( Entry< String, List< Type > > entry : t2Casted.subTypeSet() ) {
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

	public Value cast( Value value )
		throws TypeCastingException
	{
		return cast( value, new StringBuilder( "#Message" ) );
	}

	public abstract void cutChildrenFromValue( Value value );
	protected abstract Range cardinality();
	protected abstract void check( Value value, StringBuilder pathBuilder )
		throws TypeCheckingException;
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

		protected Value cast( Value value, StringBuilder pathBuilder )
			throws TypeCastingException
		{
			return linkedType.cast( value, pathBuilder );
		}
	}
}