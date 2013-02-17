/***************************************************************************
 *   Copyright (C) 2012 by Julie Meinicke Nielsen                          *
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

import java.util.*;
import java.util.Map.Entry;
import jolie.lang.Constants;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Pair;

/**
 * Type definition for having multiple options for type structure.
 * @author Julie Meinicke Nielsen
 */
public class TypeChoiceDefinition extends TypeDefinition {
	
	private List< Map< String, List< TypeDefinition > > > options; //An option consists of a subtype list
	
	public TypeChoiceDefinition( ParsingContext context, String id, List< List< TypeDefinition > > options )
	{
		super( context, id, Constants.RANGE_ONE_TO_ONE ); //default range, since range can never be explicitly defined for a choice according to the grammar
		
		this.options = new ArrayList< Map< String, List< TypeDefinition > > >();
		Map< String, List< TypeDefinition > > optionMap;
		String typeId;
		
		for ( List< TypeDefinition > option : options ) {
			optionMap = new HashMap< String, List< TypeDefinition > >();
			for ( TypeDefinition type : option ) {
				typeId = type.id();
				if ( optionMap.containsKey( typeId ) == false ) {
					optionMap.put( typeId, new ArrayList< TypeDefinition >() );
				}
				optionMap.get( typeId ).add( type );
			}
			this.options.add( optionMap );
		}
	}
		
	public List< Map< String, List< TypeDefinition > > > options()
	{
		return options;
		
//		List< List < TypeDefinition > > optionsList = new ArrayList< List < TypeDefinition > >();
//		List < TypeDefinition > optionList;
//		for ( Map< String, List< TypeDefinition > > option : options ) {
//			optionList = new ArrayList< TypeDefinition >();
//			for( Map.Entry< String, List< TypeDefinition > > entry : option.entrySet() ) {
//				for ( TypeDefinition type : entry.getValue() ) {
//					optionList.add( type );
//				}
//			}
//			optionsList.add( optionList );
//		}
//		return optionsList;
	}
	
	/*
	public void putOption ( TypeDefinition option )
	{
		options.add(option);
	}
	*/
	
	//TODO: Adapt to new version
	/**
	 * The first found option that is equivalent to type is returned. 
	 * If non of the options are equivalent to type, null is returned.
	 * @param type
	 * @return equivalent option or null
	 */
	public TypeDefinition getEquivalentOption( TypeDefinition type ) {
		/* for ( TypeDefinition option : options ) {
			if ( type.isEquivalentTo(option) ) {
				return option;
			}
		} */
		return null;
	}
	
	/**
	 * If all options are equivalent and can be rewritten as an TypeInlineDefinition or TypeDefinitionLink, then return it.
	 * @return equivalent typeInlineDefinition, typeDefinitionLink or null if such doesn't exist.
	 */
	public TypeInlineDefinition convertToTypeInlineDefinition( List<String> recursiveTypeChecked ) {
		
		Iterator<  List< TypeDefinition > > option0Iterator; //iterator to first option
		Iterator<  List< TypeDefinition > > optionIterator; //iterator to other options
		List< TypeDefinition > typeList; //list of elements in an option
		TypeDefinition type0; //only element in first option.
		
		option0Iterator = options.get( 0 ).values().iterator();
		typeList = option0Iterator.next();
		if ( typeList.size() != 1 || option0Iterator.hasNext() ) { //doesn't fit the structure of an inline
			return null;
		}
		type0 = typeList.get( 0 );
		for ( int i=1; i < options.size(); i++ ) { //Check whether all options are equal
			optionIterator = options.get( i ).values().iterator();
			typeList = optionIterator.next();
			if ( typeList.size() != 1 || optionIterator.hasNext() ) { //doesn't fit the structure of an inline
			return null;
			} else {
				if ( type0.isEquivalentTo_recursive( typeList.get( 0 ), recursiveTypeChecked ) == false ) {
					return null;
				}
			}
		}
		if ( type0 instanceof TypeDefinitionLink ) {
			type0 = ((TypeDefinitionLink)type0).lastLinkedType();
		}
		if ( type0 instanceof TypeInlineDefinition ) {
			return (TypeInlineDefinition)type0;
		} else {
			return (( TypeChoiceDefinition)type0).convertToTypeInlineDefinition( recursiveTypeChecked );
		}
		
// OLD VERSION		
//		List< List< TypeDefinition > > options = options();
//		
//		List< TypeDefinition > option0 = options.get( 0 );
//		if ( option0.size() != 1 ) { //doesn't fit the structure of an inline
//			return null;
//		}
//		List< TypeDefinition > option;
//		TypeDefinition type0 = option0.get( 0 );
//		for ( int i=1; i < options.size(); i++ ) { //Check whether all options are equal
//			option = options.get( i );
//			if ( option.size() != 1 ) { //doesn't fit the structure of an inline
//				return null;
//			} else {
//				if ( type0.isEquivalentTo_recursive( option.get( 0 ), recursiveTypeChecked ) == false ) {
//					return null;
//				}
//			}
//		}
//		if ( type0 instanceof TypeDefinitionLink ) {
//			type0 = ((TypeDefinitionLink)type0).lastLinkedType();
//		}
//		if ( type0 instanceof TypeInlineDefinition ) {
//			return (TypeInlineDefinition)type0;
//		} else {
//			return (( TypeChoiceDefinition)type0).convertToTypeInlineDefinition( recursiveTypeChecked );
//		}
	}
	
	/**
	 * Returns true if the variable path is contained in all options.
	 * @param it
	 * @return whether the variable path is contained in all options.
	 */
	@Override
	protected boolean containsPath( Iterator< Pair< OLSyntaxNode, OLSyntaxNode > > it )
	{
		boolean isInOption = false;
		Iterator<  List< TypeDefinition > > optionIterator; //iterator to options
		List< TypeDefinition > typeList; //list of elements in an option
		
		
		//String nodeName = ((ConstantStringExpression)it.key()).value();
		//if ( hasSubType( nodeName ) ) {
		
		for ( int i=1; i < options.size(); i++ ) {
			optionIterator = options.get( i ).values().iterator();
			for ( TypeDefinition type : optionIterator.next() ) {
				if ( type.containsPath(it) == true ) {
					isInOption = true;
					i = option.size();
				}
			}
			
			
			
			
		}
		
			
		
		
		for ( List< TypeDefinition > option : options ) {
			for ( int i=0; i < option.size(); i++ ) {
				TypeDefinition type = option.get( i );
				if ( type.containsPath(it) == true ) {
					isInOption = true;
					i = option.size();
				}
			}
			if ( isInOption == false ) {
				return false;
			}
		}
		return true;
		
		
		
		
		
		
		
		
		
		
//	OLD VERSION		
//		boolean isInOption = false;
//		
//		List< List< TypeDefinition > > options = options();
//		
//		for ( List< TypeDefinition > option : options ) {
//			for ( int i=0; i < option.size(); i++ ) {
//				TypeDefinition type = option.get( i );
//				if ( type.containsPath(it) == true ) {
//					isInOption = true;
//					i = option.size();
//				}
//			}
//			if ( isInOption == false ) {
//				return false;
//			}
//		}
//		return true;
	}
	
	/**
	 * introduced for checking also recursive type equalness
	 * @author Claudio Guidi
	 * 28-June-2012 Julie Meinicke Nielsen: Added type parsing.
	 */
	protected boolean isEquivalentTo_recursive( TypeDefinition other, List<String> recursiveTypeChecked )
	{
		if ( other instanceof TypeDefinitionLink ) {
			other = ((TypeDefinitionLink)other).lastLinkedType();
		}
		if ( other instanceof TypeChoiceDefinition ) {
			return checkTypeEqualness(this, (TypeChoiceDefinition)other, recursiveTypeChecked);
		} else { //If all the choice options are equal, there is a change that this and other are equal.
			TypeDefinition simplified = convertToTypeInlineDefinition( recursiveTypeChecked );
			if ( simplified == null ) {
				return false;
			} else {
				return checkTypeEqualness( (TypeInlineDefinition)simplified, (TypeInlineDefinition)other, recursiveTypeChecked );
			}
		}
	}
	
	public TypeChoiceDefinition copy() {
		List< List< TypeDefinition > > options = options();
		List< List< TypeDefinition > > copiedOptions = new LinkedList< List< TypeDefinition > >();
		List< TypeDefinition > option;
		
		for ( int i=0; i< options.size(); i++ ) {
			option = options.get(i);
			copiedOptions.add( new LinkedList< TypeDefinition >() );
			for ( TypeDefinition type : option ) {
				copiedOptions.get(i).add(type.copy());
			}
		}
		return new TypeChoiceDefinition(this.context(), this.id(), copiedOptions);
	}
	
	@Override
	public void accept(OLVisitor visitor)
	{
		visitor.visit( this );
	}
}