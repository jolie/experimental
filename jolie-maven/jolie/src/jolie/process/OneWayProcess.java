/***************************************************************************
 *   Copyright (C) 2006-2011 by Fabrizio Montesi <famontesi@gmail.com>     *
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

import java.util.concurrent.Future;
import jolie.ExecutionThread;
import jolie.Interpreter;
import jolie.net.SessionMessage;
import jolie.runtime.ExitingException;
import jolie.runtime.FaultException;
import jolie.runtime.InputOperation;
import jolie.runtime.OneWayOperation;
import jolie.runtime.VariablePath;

public class OneWayProcess implements InputOperationProcess
{
	private final OneWayOperation operation;
	private final VariablePath varPath;

	public OneWayProcess( OneWayOperation operation, VariablePath varPath )
	{
		this.operation = operation;
		this.varPath = varPath;
	}

	public InputOperation inputOperation()
	{
		return operation;
	}
	
	public Process clone( TransformationReason reason )
	{
		return new OneWayProcess( operation, varPath );
	}
	
	public VariablePath inputVarPath()
	{
		return varPath;
	}

	public Process receiveMessage( final SessionMessage sessionMessage, jolie.State state )
	{
		log( "received message " + sessionMessage.message().id() );
		if ( varPath != null ) {
			varPath.getValue( state.root() ).refCopy( sessionMessage.message().value() );
		}

		return NullProcess.getInstance();
	}

	public void run()
		throws FaultException, ExitingException
	{
		ExecutionThread ethread = ExecutionThread.currentThread();
		if ( ethread.isKilled() ) {
			return;
		}

		Future< SessionMessage > f = ethread.requestMessage( operation );
		try {
			SessionMessage m = f.get();
			receiveMessage( m, ethread.state() ).run();
		} catch( Exception e ) {
			Interpreter.getInstance().logSevere( e );
		}
	}

	private void log( String message )
	{
		if ( Interpreter.getInstance().verbose() ) {
			Interpreter.getInstance().logInfo( "[OneWay operation " + operation.id() + "]: " + message );
		}
	}
	
	public boolean isKillable()
	{
		return true;
	}
}
