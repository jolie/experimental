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

package joliex.plasma;

import joliex.plasma.impl.InterfaceVisitor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.logging.Logger;
import jolie.CommandLineException;
import jolie.CommandLineParser;
import jolie.lang.parse.OLParser;
import jolie.lang.parse.ParserException;
import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.Program;

/**
 *
 * @author Fabrizio Montesi
 */
public class Jolie2Plasma
{
    public static void main( String[] args )
	{
		try {
			CommandLineParser cmdParser = new CommandLineParser( args, Jolie2Plasma.class.getClassLoader() );
			args = cmdParser.arguments();
			if ( args.length < 2 ) {
				throw new CommandLineException( "Insufficient number of arguments" );
			}

			Writer writer = new BufferedWriter( new FileWriter( args[0] ) );

			OLParser parser = new OLParser(
				new Scanner( cmdParser.programStream(), cmdParser.programFilepath() ),
				cmdParser.includePaths(),
				Jolie2Plasma.class.getClassLoader()
			);
			Program program = parser.parse();

			new InterfaceConverter(
				program,
				Arrays.copyOfRange( args, 1, args.length ),
				Logger.getLogger( "jolie2plasma" )
			).convert( writer );
		} catch( CommandLineException e ) {
			System.out.println( e.getMessage() );
			System.out.println( "Syntax is: jolie2plasma [jolie options] <jolie filename> <output filename> [interface name list]" );
		} catch( IOException e ) {
			e.printStackTrace();
		} catch( ParserException e ) {
			e.printStackTrace();
		} catch( InterfaceVisitor.InterfaceNotFound e ) {
			e.printStackTrace();
		}
    }
}
