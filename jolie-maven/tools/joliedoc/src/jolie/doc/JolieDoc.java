/***************************************************************************
 *   Copyright (C) 2010 by Fabrizio Montesi <famontesi@gmail.com>          *
 *   Copyright (C) 2010 by Balint Maschio <bmaschio@italianasoftware.com>  *
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
package jolie.doc;

import java.io.IOException;
import java.net.URI;
import jolie.CommandLineException;
import jolie.CommandLineParser;
import jolie.doc.impl.html.HtmlDocumentCreator;
import jolie.lang.parse.ParserException;
import jolie.lang.parse.SemanticVerifier;
import jolie.lang.parse.ast.Program;
import jolie.lang.parse.util.ParsingUtils;
import jolie.lang.parse.util.ProgramInspector;

public class JolieDoc
{
	public static void main( String[] args )
	{
		try {
			CommandLineParser cmdParser = new CommandLineParser( args, JolieDoc.class.getClassLoader() );
			args = cmdParser.arguments();
			SemanticVerifier.Configuration configuration = new SemanticVerifier.Configuration();
			configuration.checkForMain = false;
			Program program = ParsingUtils.parseProgram(
				cmdParser.programStream(),
				URI.create( "file:" + cmdParser.programFilepath() ),
				cmdParser.includePaths(), JolieDoc.class.getClassLoader(), cmdParser.definedConstants(),
				configuration
			);			
			
			ProgramInspector inspector=ParsingUtils.createInspector( program );

			HtmlDocumentCreator document = new HtmlDocumentCreator( inspector, program.context().source() );
			document.ConvertDocument();
			/*
			HTMLDocumentCreator document = new HTMLDocumentCreator();
			document.createDocument( program, cmdParser.programFilepath() );*/
		} catch( CommandLineException e ) {
			System.out.println( e.getMessage() );
			System.out.println( "Syntax is: joliedoc [jolie options] <jolie filename> [interface name list]" );
		} catch( IOException e ) {
			e.printStackTrace();
		} catch( ParserException e ) {
			System.out.println( e.getMessage() );
			/*} catch( DocumentCreationException e ) {
			e.printStackTrace();*/
		}
	}
}
