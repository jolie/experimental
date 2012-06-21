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

import java.util.LinkedList;
import java.util.List;
import jolie.lang.NativeType;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Range;

/**
 * Type definition for having multiple options for type structure.
 * @author Julie Meinicke Nielsen
 */
public class TypeChoiceDefinition extends TypeDefinition {
	
	private final List< TypeDefinition > options;
	private String regex = null;
	
	public TypeChoiceDefinition( ParsingContext context, String id, Range cardinality, List<TypeDefinition> options)
	{
		super( context, id, cardinality );
		this.options = options;
	}
	
	public List<TypeDefinition> options()
	{
		return options;
	}

	@Override
	protected String toRegex()
	{
		if ( regex == null) {	//Initialize regex if not already initialized.
			regex = id() + ":";
			
			for( int i = 0; i < options.size()-1 ; i++ ) {
				regex += options.get(i).toRegex() + "+";
			}
			regex += options.get(options.size()).toRegex();
		}
		return regex;
	}
	
	@Override
	public void accept(OLVisitor visitor)
	{
		visitor.visit( this );
	}
}
