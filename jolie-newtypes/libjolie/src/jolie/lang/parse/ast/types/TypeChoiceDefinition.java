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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Pair;
import jolie.util.Range;

/**
 * Type definition for having multiple options for type structure.
 * @author Julie Meinicke Nielsen
 */
public class TypeChoiceDefinition extends TypeDefinition {
	
	private final List< TypeDefinition > options;
	
	public TypeChoiceDefinition( ParsingContext context, String id, Range cardinality, List< TypeDefinition > options)
	{
		super( context, id, cardinality );
		this.options = options;
	}

	public TypeChoiceDefinition( ParsingContext context, Range cardinality, List< TypeDefinition > options)
	{
		super( context, cardinality );
		this.options = options;
	}
	
	public List< TypeDefinition > options()
	{
		return options;
	}
	
	public void putOption ( TypeDefinition option )
	{
		options.add(option);
	}
	
	/**
	 * The first found option that is equivalent to type is returned. 
	 * If non of the options are equivalent to type, null is returned.
	 * @param type
	 * @return equivalent option or null
	 */
	public TypeDefinition getEquivalentOption( TypeDefinition type ) {
		for ( TypeDefinition option : options ) {
			if ( type.isEquivalentTo(option) ) {
				return option;
			}
		}
		return null;
	}
	
	/**
	 * Returns true if the variable path is contained in all options.
	 * @param it
	 * @return whether the variable path is contained in all options.
	 */
	@Override
	protected boolean containsPath( Iterator< Pair< OLSyntaxNode, OLSyntaxNode > > it )
	{
		for ( TypeDefinition option : options ) {
			if ( option.containsPath(it) == false ) {
				return false;
			}
		}
		return true;
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
		} else {
			return false;
		}
	}
	
	public TypeChoiceDefinition copy() {
		List< TypeDefinition > copiedOptions = new LinkedList< TypeDefinition >();
		for ( TypeDefinition option : options ) {
			copiedOptions.add(option.copy());
		} 
		return new TypeChoiceDefinition(this.context(), this.id(), this.cardinality(), copiedOptions);
	}
	
	@Override
	public void accept(OLVisitor visitor)
	{
		visitor.visit( this );
	}
}