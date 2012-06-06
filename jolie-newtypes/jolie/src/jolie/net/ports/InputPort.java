/***************************************************************************
 *   Copyright 2011 (C) by Fabrizio Montesi <famontesi@gmail.com>          *
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

package jolie.net.ports;

import java.net.URI;
import java.util.Map;
import jolie.net.AggregatedOperation;
import jolie.runtime.VariablePath;

/**
 * Represents an input port definition.
 * @author Fabrizio Montesi
 */
public class InputPort implements Port
{
	private final String name;
	private final Interface iface;
	private final VariablePath protocolConfigurationPath;
	private final Map< String, AggregatedOperation > aggregationMap;
	private final Map< String, OutputPort > redirectionMap;
	private final URI location;

	/**
	 * Constructor
	 * @param name the name of the input port
	 * @param location the location of the input port
	 * @param protocolConfigurationPath the protocol configuration variable path of this port
	 * @param iface the interface of this input port
	 * @param aggregationMap the aggregation map for this input port
	 * @param redirectionMap the redirection map for this input port
	 */
	public InputPort(
		String name,
		URI location,
		VariablePath protocolConfigurationPath,
		Interface iface,
		Map< String, AggregatedOperation > aggregationMap,
		Map< String, OutputPort > redirectionMap
	) {
		this.name = name;
		this.location = location;
		this.iface = iface;
		this.aggregationMap = aggregationMap;
		this.redirectionMap = redirectionMap;
		this.protocolConfigurationPath = protocolConfigurationPath;
	}
	
	/**
	 * Returns the name of this input port
	 * @return the name of this input port
	 */
	public String name()
	{
		return name;
	}

	/**
	 * Returns the {@link Interface} of this input port
	 * @return the {@link Interface} of this input port
	 */
	public Interface getInterface()
	{
		return iface;
	}

	/**
	 * Returns the variable path to the value containing the protocol configuration for this input port
	 * @return the variable path to the value containing the protocol configuration for this input port
	 * @see VariablePath
	 */
	public VariablePath protocolConfigurationPath()
	{
		return protocolConfigurationPath;
	}

	/**
	 * Returns the aggregation map for this input port.
	 * The keys of the map are the names of the aggregated operations.
	 */
	public Map< String, AggregatedOperation > aggregationMap()
	{
		return aggregationMap;
	}

	/**
	 * Returns the redirection map of this input port.
	 * @return the redirection map of this input port
	 */
	public Map< String, OutputPort > redirectionMap()
	{
		return redirectionMap;
	}

	/**
	 * Returns the location URI of this input port.
	 * @return the location URI of this input port.
	 */
	public URI location()
	{
		return location;
	}

	/**
	 * Returns <code>true</code> if this input port can handle a message for operation operationName (either directly or through aggregation), false otherwise.
	 * @param operation the <code>InputOperation</code> name to check for
	 * @return <code>true</code> if this CommListener can handle a message for the given operationName, <code>false</code> otherwise
	 */
	public boolean canHandleInputOperation( String operationName )
	{
		if ( canHandleInputOperationDirectly( operationName ) ) {
			return true;
		} else {
			return aggregationMap.containsKey( operationName );
		}
	}

	/**
	 * Returns <code>true</code> if this input port can handle a message for operation operationName directly (i.e. without recurring to aggregated output ports), <code>false</code> otherwise.
	 * @param operation the input operation name to check for
	 * @return <code>true</code> if this listener can handle a message for the given operationName directly, <code>false</code> otherwise.
	 */
	public boolean canHandleInputOperationDirectly( String operationName )
	{
		return iface.containsOperation( operationName );
	}

	/**
	 * Returns the operation aggregated by this input port that is identified by operationName
	 * @param operationName the name of the aggregated operation
	 * @return the operation aggregated by this input port that is identified by operationName
	 */
	public AggregatedOperation getAggregatedOperation( String operationName )
	{
		return aggregationMap.get( operationName );
	}
}
