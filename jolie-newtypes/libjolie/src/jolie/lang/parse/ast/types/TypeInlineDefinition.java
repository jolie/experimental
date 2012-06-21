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

import dk.brics.automaton.RegExp;
import java.util.*;
import jolie.lang.NativeType;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Range;

/**
 * @author Fabrizio Montesi
 */
public class TypeInlineDefinition extends TypeDefinition
{
	private final NativeType nativeType;
	private Map< String, TypeDefinition > subTypes = null;
	private boolean untypedSubTypes = false;
	private String regex = null;

	public TypeInlineDefinition( ParsingContext context, String id, NativeType nativeType, Range cardinality )
	{
		super( context, id, cardinality );
		this.nativeType = nativeType;
	}
	
	public TypeInlineDefinition( ParsingContext context, NativeType nativeType, Range cardinality )
	{
		super( context, cardinality );
		this.nativeType = nativeType;
	}

	public String toRegex()
	{
		if ( regex == null) {	//Initialize regex if not already initialized.
			regex = id() + ":" + nativeType();
			
			if ( hasSubTypes() ) {
				List<String> keys = new LinkedList<String>(subTypes.keySet());
				java.util.Collections.sort(keys);
				
				regex += "_(";
				for( int i = 0; i < keys.size()-1 ; i++ ) {
					regex += getSubType(keys.get(i)).toRegex() + ",";
				}
				regex += getSubType(keys.get(keys.size())).toRegex() + ")";
			}
		}
		
		new RegExp(regex);
		
		return regex;
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

	public void accept( OLVisitor visitor )
	{
		visitor.visit( this );
	}
}
