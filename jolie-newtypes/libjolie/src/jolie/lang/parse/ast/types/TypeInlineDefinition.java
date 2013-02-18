/***************************************************************************
 *   Copyright (C) 2009 by Fabrizio Montesi                                *
 *   Copyright (C) 2008 by Elvis Ciotti                                    *
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
import jolie.lang.NativeType;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Pair;
import jolie.util.Range;

/**
 * @author Fabrizio Montesi
 * 12-Feb-2013 Julie Meinicke Nielsen: Changed value in subTypes to a list to
 * make it handle multiple subTypes with null as ID
 */
public class TypeInlineDefinition extends TypeDefinition
{
	private final NativeType nativeType;
	private Map< String, TypeDefinition > subTypes = null;
	private boolean untypedSubTypes = false;

	public TypeInlineDefinition( ParsingContext context, String id, NativeType nativeType, Range cardinality )
	{
		super( context, id, cardinality );
		this.nativeType = nativeType;
	}

	protected boolean containsPath( Iterator< Pair< OLSyntaxNode, OLSyntaxNode > > it )
	{
		if ( it.hasNext() == false ) {
			return nativeType() != NativeType.VOID;
		}
		
		if ( untypedSubTypes() ) {
			return true;
		}
		
		Pair< OLSyntaxNode, OLSyntaxNode > pair = it.next();
		String nodeName = ((ConstantStringExpression)pair.key()).value();
		if ( hasSubType( nodeName ) ) {
			return true;
		}
		if ( hasSubType( Constants.NO_ID ) ) {
			if ( getSubType( Constants.NO_ID ).containsPath( it ) ) {
				return true;
			}
		}
		return false;
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
		if ( other instanceof TypeInlineDefinition ) {
			return checkTypeEqualness(this, (TypeInlineDefinition)other, recursiveTypeChecked);
		} else { //If all the choice options are equal, there is a change that this and other are equal.
			TypeInlineDefinition simplified = ((TypeChoiceDefinition)other).convertToTypeInlineDefinition( recursiveTypeChecked );
			if ( simplified == null ) {
				return false;
			} else {
				return checkTypeEqualness( this, simplified, recursiveTypeChecked );
			}
		}
	}
	
	public NativeType nativeType()
	{
		return nativeType;
	}

	public void setUntypedSubTypes( boolean b )
	{
		untypedSubTypes = b;
	}

	public boolean hasSubType( String id )
	{
		if ( subTypes == null ) {
			return false;
		} else {
			return subTypes.containsKey( id );
		}
	}
	
	public Set< Map.Entry< String, TypeDefinition > > subTypes()
	{
		if ( subTypes == null ) {
			return null;
		}
		return subTypes.entrySet();
	}
	
	public TypeDefinition getSubType( String id )
	{
		if ( subTypes != null ) {
			return subTypes.get( id );
		}
		return null;
	}

	public boolean hasSubTypes()
	{
		if ( subTypes != null && subTypes.isEmpty() == false ) {
			return true;
		}
		return false;
	}
	
	public void putSubType( TypeDefinition type )
	{
		if ( subTypes == null ) {
			subTypes = new HashMap< String, TypeDefinition >();
		}
		subTypes.put( type.id(), type );
	}
	
	public boolean untypedSubTypes()
	{
		return untypedSubTypes;
	}

	public TypeInlineDefinition copy()
	{
		TypeInlineDefinition copiedType = new TypeInlineDefinition(context(), id(), nativeType, cardinality());
		
		if ( untypedSubTypes() ) {
			copiedType.setUntypedSubTypes(untypedSubTypes());
		} else if ( hasSubTypes() ) { //copy subTypes if any
			for ( TypeDefinition subType : subTypes.values() ) {
					copiedType.putSubType(subType.copy());
			}
		}
		return copiedType;
	}
	
	public void accept( OLVisitor visitor )
	{
		visitor.visit( this );
	}
}
