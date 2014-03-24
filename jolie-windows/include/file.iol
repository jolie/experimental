/***************************************************************************
 *   Copyright (C) 2008 by Fabrizio Montesi <famontesi@gmail.com>          *
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

type FileNotFoundType:WeakJavaExceptionType

type CopyDirRequest: void {
	.from: string
	.to: string
}

type ReadFileRequest:void {
	.filename:string
	.format?:string { // Can be "base64", "binary", "text" or "xml" (defaults to "text")
		.charset?:string
	}
}

type WriteFileRequest:void {
	.filename:string
	.content:undefined
	.format?:string { // Can be "binary", "text" or "xml" (defaults to "text")
		.doctype_system?:string // If format is "xml", adds it as a DOCTYPE system tag
		.schema*:string
		.indent?:bool // if true, indentation is applied to file (default: false)
		.encoding? : string // set the encoding. Default UTF-8
	}
	.append?:int // Default: 0
}

type DeleteRequest:string { // The filename to delete
	.isRegex?:int // 1 if the filename is a regular expression, 0 otherwise
}

type RenameRequest:void {
	.filename:string
	.to:string
}

type ListRequest:void {
	.directory:string
	.regex?:string
	.dirsOnly?:bool	// List only directories?
	.order?: void {
		.byname?: bool
	}
}

type ListResponse:void {
	.result[0,*]:string
}

interface FileInterface {
RequestResponse:
	/**!
	  it returns if a filename is a directtory or not. False if the file does not exist.
	*/
	isDirectory( string )( bool ) throws FileNotFound(FileNotFoundType) IOException(IOExceptionType),
	readFile(ReadFileRequest)(undefined) throws FileNotFound(FileNotFoundType) IOException(IOExceptionType),
	writeFile(WriteFileRequest)(void) throws FileNotFound(FileNotFoundType) IOException(IOExceptionType),
	
	/**!
	  it copies a source directory into a destination one
	*/
	copyDir( CopyDirRequest )( bool ) throws IOException FileNotFound,
	
	delete(DeleteRequest)(bool) throws IOException(IOExceptionType),

	/**!
	   it deletes a directory recursively removing all its contents
	*/
	deleteDir( string )( bool ) throws IOException(IOExceptionType),
	
	/**!
	  it takes a file content and returns the size
	*/
	getSize( any )( int ),
	
	rename(RenameRequest)(void) throws IOException(IOExceptionType),
	list(ListRequest)(ListResponse),
	/**!
	* 
	* it creates the directory specified in the request root. Returns true if the directory has been 
	* created with success, false otherwise
	*/
	mkdir( string )( bool ),

	/**!
	* it tests if the specified file or directory exists or not.
	*/
	exists( string )( bool ),
	getServiceDirectory(void)(string),
	getFileSeparator(void)(string),
	getMimeType(string)(string) throws FileNotFound(FileNotFoundType),
	setMimeTypeFile(string)(void) throws IOException(IOExceptionType),
	convertFromBinaryToBase64Value( raw )( string ),
	convertFromBase64ToBinaryValue( string )( raw ) throws IOException(IOExceptionType)
}

outputPort File {
Interfaces: FileInterface
}

embedded {
Java:
	"joliex.io.FileService" in File
}
