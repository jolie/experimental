/***************************************************************************
 *   Copyright (C) by Fabrizio Montesi                                     *
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

package jolie.process;

import jolie.Interpreter;
import jolie.net.ports.OutputPort;
import jolie.runtime.ExitingException;
import jolie.runtime.embedding.EmbeddedServiceLoader;
import jolie.runtime.embedding.EmbeddedServiceLoadingException;
import jolie.runtime.FaultException;

public class InitDefinitionProcess extends DefinitionProcess
{
	public InitDefinitionProcess( Process process )
	{
		super( process );
	}

	/*private void insertCorrelationSetValues( Collection< List< VariablePath > > correlationSet )
	{
		for( List< VariablePath > cvarList : correlationSet ) {
			cvarList.get( 0 ).setValue( Value.createCSetValue() );
		}
	}*/
	
	@Override
	public void run()
		throws FaultException
	{
		Interpreter interpreter = Interpreter.getInstance();
		try {
			for( OutputPort outputPort : interpreter.outputPorts() ) {
				try {
					outputPort.configurationProcess().run();
				} catch( FaultException fe ) {
					// If this happens, it's been caused by a bug in the SemanticVerifier
					assert( false );
				} catch( ExitingException e ) {
					interpreter.logSevere( e );
					assert false;
				}
			}
			
			for( EmbeddedServiceLoader loader : interpreter.embeddedServiceLoaders() ) {
				loader.load();
			}

			for( OutputPort outputPort : interpreter.outputPorts() ) {
				outputPort.optimizeLocation();
			}

			interpreter.embeddedServiceLoaders().clear(); // Clean up for GC
			
			//insertCorrelationSetValues( interpreter.correlationSets() );

			for( Process p : interpreter.commCore().protocolConfigurations() ) {
				try {
					p.run();
				} catch( ExitingException e ) {
					interpreter.logSevere( e );
					assert false;
				}
			}

			try {
				super.run();
			} catch( ExitingException e ) {}
		} catch( EmbeddedServiceLoadingException e ) {
			//Interpreter.getInstance().logger().severe( e.getMessage() );
			interpreter.logSevere( e );
		}
	}
}