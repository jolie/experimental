/***************************************************************************
 *   Copyright (C) 2009 by Fabrizio Montesi                                *
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
import java.util.List;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Pair;
import jolie.util.Range;

/**
 *
 * @author Fabrizio Montesi
 */
public class TypeDefinitionLink extends TypeDefinition
{
	private TypeDefinition linkedType;
	private final String linkedTypeName;
	private String regex = null;

	public TypeDefinitionLink( ParsingContext context, String id, Range cardinality, String linkedTypeName )
	{
		super( context, id, cardinality );
		this.linkedTypeName = linkedTypeName;
	}

	public TypeDefinitionLink( ParsingContext context, String id, Range cardinality, TypeDefinition linkedType )
	{
		super( context, id, cardinality );
		this.linkedTypeName = linkedType.id();
		this.linkedType = linkedType;
	}

	@Override
	protected boolean containsPath( Iterator< Pair< OLSyntaxNode, OLSyntaxNode > > it )
	{
		return linkedType.containsPath(it);
	}

	/**
	 * introduced for checking also recursive type equalness
	 * @author Claudio Guidi
	 */
	@Override
	protected boolean isEquivalentTo_recursive( TypeDefinition other, List<String> recursiveTypeChecked )
	{		
		return lastLinkedType().isEquivalentTo_recursive(other, recursiveTypeChecked);
	}
	
	public String linkedTypeName()
	{
		return linkedTypeName;
	}

	public void setLinkedType( TypeDefinition linkedType )
	{
		this.linkedType = linkedType;
	}

	public TypeDefinition linkedType()
	{
		return linkedType;
	}
	
	/**
	 * In case the linked type is a link, the link chain is followed such that
	 * the last type is returned.
	 * @return either a TypeDefinitionChoice or a TypeInlineDefinition
	 */
	public TypeDefinition lastLinkedType()
	{
		if ( linkedType instanceof TypeDefinitionLink ) {
			return ((TypeDefinitionLink)linkedType).lastLinkedType();
		} else {
			return linkedType;
		}
	}

	public TypeDefinition copy()
	{
		return linkedType.copy();
	}
	
	public void accept( OLVisitor visitor )
	{
		visitor.visit( this );
	}
}