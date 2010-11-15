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


import java.util.Collection;
import java.util.HashSet;
import jolie.ExecutionThread;
import jolie.SessionThread;
import jolie.process.Process;
import jolie.process.SpawnProcess;

public class SpawnExecution
{
	private class SpawnedThread extends SessionThread
	{
		final private int index;

		public SpawnedThread(
			ExecutionThread parentThread,
			Process process,
			int index
		)
		{
			super( process, parentThread );
			this.index = index;
		}

		@Override
		public void run()
		{
			parentSpawnProcess.indexPath().getValue().setValue( index );
			try {
				process().run();
			} catch( FaultException f ) {}
			catch( ExitingException e ) {}
			if ( parentSpawnProcess.inPath() != null ) {
				parentSpawnProcess.inPath().getValueVector( ethread.state().root() ).get( index )
					.deepCopy( parentSpawnProcess.inPath().getValueVector().first() );
			}
			terminationNotify( this );
		}
	}
	
	final private Collection< SpawnedThread > threads = new HashSet< SpawnedThread >();
	final private SpawnProcess parentSpawnProcess;
	final private ExecutionThread ethread = ExecutionThread.currentThread();

	public SpawnExecution( SpawnProcess parent )
	{
		this.parentSpawnProcess = parent;
		//this.ethread = ExecutionThread.currentThread();
	}
	
	public void run()
		throws FaultException
	{
		if ( parentSpawnProcess.inPath() != null ) {
			parentSpawnProcess.inPath().undef();
		}
		int upperBound = parentSpawnProcess.upperBound().evaluate().intValue();
		SpawnedThread thread;
		synchronized( this ) {
			for( int i = 0; i < upperBound; i++ ) {
				thread = new SpawnedThread(
					ethread,
					parentSpawnProcess.body(),
					i
				);
				threads.add( thread );
			}

			for( SpawnedThread t : threads ) {
				// We start threads in this other cycle to avoid race conditions on inPath
				t.start();
			}

			while( !threads.isEmpty() ) {
				try {
					wait();
				} catch( InterruptedException e ) {}
			}
		}
	}
	
	private void terminationNotify( SpawnedThread thread )
	{
		synchronized( this ) {
			threads.remove( thread );
			
			if ( threads.isEmpty() ) {
				notify();
			}
		}
	}
}
