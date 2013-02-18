/***************************************************************************
 *   Copyright (C) 2008 by Elvis Ciotti                                    *
 *   Copyright (C) 2009 by Fabrizio Montesi                                *
 *   Copyright (C) 2011 by Claudio Guidi                                *
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

package jolie.lang.parse.ast.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import jolie.lang.Constants;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Pair;
import jolie.util.Range;

/**
 * Representation for a type definition.
 * @author Fabrizio Montesi
 */
public abstract class TypeDefinition extends OLSyntaxNode
{
	private String id;
	private final Range cardinality;

	/**
	 * Constructor
	 * @param context the parsing context for this AST node
	 * @param id the name identifier for this type definition
	 * @param cardinality the cardinality of this type
	 */
	public TypeDefinition( ParsingContext context, String id, Range cardinality )
	{
		super( context );
		this.id = id;
		this.cardinality = cardinality;
	}

	public String id()
	{
		return id;
	}
	
	/**
	 * Set ID
	 * @param the new ID 
	 * @author Julie Meinicke Nielsen
	 */
	public void setId( String newId )
	{
		
		id = newId;
		
	}
	
	public Range cardinality()
	{
		return cardinality;
	}

	public boolean containsPath( VariablePathNode variablePath )
	{
		return containsPath( variablePath.path().iterator() );
	}

	/*
	 * 13/10/2011 - Claudio Guidi: added recursiveTypesChecked list for checking recursive types equalness
	 */
	protected static boolean checkTypeEqualness( TypeInlineDefinition left, TypeInlineDefinition right, List<String> recursiveTypesChecked )
	{
		if ( left.nativeType() != right.nativeType() ) {
			return false;
		}
		
		if ( left.cardinality().equals( right.cardinality() ) == false ) {
			return false;
		}
		
		if ( left.untypedSubTypes() ) {
			return right.untypedSubTypes();
		} else {
			if ( right.untypedSubTypes() ) {
				return false;
			}
			if ( left.hasSubTypes() ) {
				if ( left.subTypes().size() != right.subTypes().size() ) {
					return false;
				}
				
				for( Entry< String, TypeDefinition > entry : left.subTypes() ) {
					TypeDefinition rightSubType = right.getSubType( entry.getKey() );
					if ( rightSubType == null ) {
						return false;
					}
					if ( entry.getKey().equals( Constants.NO_ID ) ) {
						//TODO: Handle NO_ID
						System.out.println( "checkTypeEqualness: NO_ID encountered" );
						
					} else {
						
						if ( recursiveTypesChecked.contains( entry.getKey() ) ) {
							return true;
						} else {
							recursiveTypesChecked.add( entry.getKey() );
						}
						
						if ( entry.getValue().isEquivalentTo_recursive( rightSubType, recursiveTypesChecked ) == false ) {
							return false;
						}
					}
				}
			} else {
				return right.hasSubTypes() == false;
			}
		}
		return true;
	}
	
	/**
	 * Check whether 2 TypeChoiceDefinitions are equivalent. 
	 * This happens when for each of the TypeChoiceDefinitions, each of its 
	 * options are contained in the other TypeChoiceDefinition's options.
	 * @param left
	 * @param right
	 * @param recursiveTypesChecked
	 * @return true if left and right are equivalent.
	 */
	protected static boolean checkTypeEqualness( TypeChoiceDefinition left, TypeChoiceDefinition right, List<String> recursiveTypesChecked )
	{
		List < List < TypeDefinition > > leftOptions = left.options();
		List < List < TypeDefinition > > rightOptions = right.options();
		TypeDefinition equivalent;
		/*
		for ( TypeDefinition leftOption : leftOptions ) {
			equivalent = right.getEquivalentOption(leftOption);
			
			if ( equivalent == null ) {
				return false;
			}// else {
				//rightOptions.remove(equivalent);	//no need to check for equivalence one more time
			//}
		}
		for ( TypeDefinition rightOption : rightOptions ) {
			if ( left.getEquivalentOption(rightOption) == null ) {
				return false;
			}			
		}
		*/ 
		
		return true;
	}
	
	//TODO: Fix it.
	/**
	 * @author Claudio Guidi
	 * 01-Sep-2011 Fabrizio Montesi: removed some type casting
	 */
	public static TypeDefinition extend( TypeDefinition inputType, TypeDefinition extender, String namePrefix )
	{		
		/*

		//TODO: Implement extend for choice types.
		if ( inputType instanceof TypeDefinitionLink ) {
			if ( ( (TypeDefinitionLink)inputType ).linkedType()  instanceof TypeChoiceDefinition ) {
				throw new UnsupportedOperationException("Extending choice types: Not supported yet.");
			} else {
				inputType = ( (TypeDefinitionLink)inputType ).linkedType();
			}
		}
		if ( extender instanceof TypeDefinitionLink ) {
			if ( ( (TypeDefinitionLink)extender ).linkedType()  instanceof TypeChoiceDefinition ) {
				throw new UnsupportedOperationException("Extending choice types: Not supported yet.");
			} else {
				extender = ( (TypeDefinitionLink)extender ).linkedType();
			}
		}		
		if ( inputType instanceof TypeChoiceDefinition || extender instanceof TypeChoiceDefinition ) {
			throw new UnsupportedOperationException("Extending choice types: Not supported yet.");
			
		}
		
		TypeInlineDefinition inputTypeCasted = (TypeInlineDefinition)inputType;
		TypeInlineDefinition extenderCasted = (TypeInlineDefinition)extender;

		
		TypeInlineDefinition newType = new TypeInlineDefinition( inputType.context(), namePrefix + "_" + inputType.id(), inputTypeCasted.nativeType(), inputType.cardinality );

		if ( inputType instanceof TypeDefinitionUndefined ) {
			TypeInlineDefinition newTid = new TypeInlineDefinition( inputType.context(), namePrefix + "_" + inputTypeCasted.id(), NativeType.ANY, inputType.cardinality );
			if ( extenderCasted.hasSubTypes() ) {
				for( Entry<String, TypeDefinition> subType : extenderCasted.subTypes() ) {
					newTid.putSubType( subType.getValue() );
				}
			}
			newType = newTid;
		} else {
			if ( inputTypeCasted.hasSubTypes() ) {
				for( Entry<String, TypeDefinition> subType : inputTypeCasted.subTypes() ) {
					newType.putSubType( subType.getValue() );
				}
			}
			if ( extenderCasted.hasSubTypes() ) {
				for( Entry<String, TypeDefinition> subType : extenderCasted.subTypes() ) {
					newType.putSubType( subType.getValue() );
				}
			}
		}
		return newType;
		*/
		return null;
	}

	/**
	 * Checks if this TypeDeclaration is equivalent to otherType.
	 * @author Fabrizio Montesi
	 */
	public boolean isEquivalentTo( TypeDefinition other )
	{
		
		List<String> recursiveTypeChecked = new ArrayList<String>();
		return isEquivalentTo_recursive(other, recursiveTypeChecked);
	}
	
	@Override
	public boolean equals( Object other )
	{
		return this == other;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 31 * hash + this.id.hashCode();
		hash = 31 * hash + this.cardinality.hashCode();
		return hash;
	}

	protected abstract boolean containsPath( Iterator< Pair< OLSyntaxNode, OLSyntaxNode > > it );
	protected abstract boolean isEquivalentTo_recursive( TypeDefinition other, List<String> recursiveTypeChecked );
	public abstract TypeDefinition copy();
}
