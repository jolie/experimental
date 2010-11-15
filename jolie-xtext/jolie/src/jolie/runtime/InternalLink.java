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


package jolie.runtime;


import java.util.LinkedList;
import java.util.List;
import jolie.ExecutionThread;
import jolie.Interpreter;
import jolie.net.CommChannel;
import jolie.net.CommMessage;
import jolie.process.InputProcessExecution;
import jolie.runtime.typing.TypeCheckingException;


/** Internal synchronization link for parallel processes.
 * 
 * @author Fabrizio Montesi
 */
public class InternalLink extends AbstractIdentifiableObject implements InputHandler
{
	private final List< InputProcessExecution > procsList =
					new LinkedList< InputProcessExecution > ();
	private int signals = 0;
	private final CommMessage linkMessage;
	
	public InternalLink( String id )
	{
		super( id );
		linkMessage = new CommMessage( CommMessage.GENERIC_ID, id, "/", Value.UNDEFINED_VALUE, null );
	}
	
	public synchronized void recvMessage( CommChannel channel, CommMessage message )
	{
		for( int i = 0; i < procsList.size(); i++ ) {
			try {
				if ( procsList.get( i ).recvMessage( null, linkMessage ) ) {
					procsList.remove( i );
					return;
				}
			} catch( TypeCheckingException e ) {
				Interpreter.getInstance().logSevere( e );
			}
		}
		signals++;
	}

	public synchronized void signForMessage( InputProcessExecution process )
	{
		try {
			if ( signals > 0 && process.recvMessage( null, linkMessage ) ) {
				signals--;
			} else {
				procsList.add( process );
			}
		} catch( TypeCheckingException e ) {
			Interpreter.getInstance().logSevere( e );
		}
	}
	
	public synchronized void cancelWaiting( InputProcessExecution process ) 
	{
		procsList.remove( process );
	}

	public static InternalLink getById( String id )
	{
		return ExecutionThread.currentThread().state().getLink( id ); 
	}
}
