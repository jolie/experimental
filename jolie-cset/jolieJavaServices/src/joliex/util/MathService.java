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

package joliex.util;

import java.math.BigDecimal;
import jolie.runtime.JavaService;
import jolie.runtime.Value;

/**
 * JavaService offering various math related functionalities.
 * @author Fabrizio Montesi
 */
public class MathService extends JavaService
{
	public Double random()
	{
		return Math.random();
	}

	public Integer abs( Integer i )
	{
		return Math.abs( i );
	}

	/**
	 * @author Claudio Guidi
	 * @author Fabrizio Montesi
	 */
	public Double round( Value v )
	{
		int decimals = 0;
		if ( v.hasChildren( "decimals" ) ) {
			decimals = v.getFirstChild( "decimals" ).intValue();
		}
		double orig = v.doubleValue();
		double power = Math.pow( 10, decimals );
		double ret = orig * power;
		if ( ret == Double.POSITIVE_INFINITY ) {
			BigDecimal b = new BigDecimal( orig );
			b = b.setScale( decimals, BigDecimal.ROUND_HALF_UP );
			ret = b.doubleValue();
		} else {
			ret = Math.round( ret ) / power;
		}
		
		return ret;
	}
}
