/***************************************************************************
 *   Copyright (C) 2008-2011 by Fabrizio Montesi <famontesi@gmail.com>     *
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


include "types/JavaException.iol"
include "types/IOException.iol"
include "types/Binding.iol"

type LoadEmbeddedServiceRequest:void {
	.filepath:string
	.type:string
}

type GetRedirectionRequest:void {
	.inputPortName:string
	.resourceName:string
}

type SetRedirectionRequest:void {
	.inputPortName:string
	.resourceName:string
	.outputPortName:string
}

type RuntimeExceptionType:JavaExceptionType

type SetOutputPortRequest:void {
	.name:string
	.location:any
	.protocol?:string { ? }
}

type SendMessageRequest:void {
	.operation:string
	.binding:Binding
	.message:undefined
}

type GetIncludePathResponse:void {
	.path*:string
}

type SetMonitorRequest:void {
	.location:any
	.protocol?:string { ? }
}

interface RuntimeInterface {
RequestResponse:
	getLocalLocation(void)(any),
	setMonitor(SetMonitorRequest)(void),
	loadEmbeddedService(LoadEmbeddedServiceRequest)(any) throws RuntimeException(RuntimeExceptionType),

	getRedirection(GetRedirectionRequest)(any),
	setRedirection(SetRedirectionRequest)(void) throws RuntimeException(RuntimeExceptionType),
	removeRedirection(GetRedirectionRequest)(void) throws RuntimeException(RuntimeExceptionType),

	getIncludePaths(void)(GetIncludePathResponse),

	setOutputPort(SetOutputPortRequest)(void),
	removeOutputPort(string)(void),
	callExit(any)(void),
	dumpState(void)(string),
	loadLibrary(string)(void) throws IOException(IOExceptionType)
}

outputPort Runtime {
Interfaces: RuntimeInterface
}

embedded {
Java:
	"joliex.lang.RuntimeService" in Runtime
}
