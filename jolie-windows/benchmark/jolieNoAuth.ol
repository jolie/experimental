include "console.iol"
include "time.iol"
include "file.iol"
type TwiceRequest:void {
     .x: int
     .key: string
}
type TwiceResponse: void {
     .y: int
}
interface twiceInterface {
	  RequestResponse: twice( TwiceRequest )( TwiceResponse ), getKey( string )( string )
	  OneWay: shutdown( void )
}
outputPort twiceOP {
	   Location: "socket://localhost:12001"
	   Protocol: sodep
	   Interfaces: twiceInterface
}

main {
     tmpFilename = args[0];
     filename = "result/" + tmpFilename + ".txt";
     exists@File( filename )( fileExists );
     if( fileExists ) {
     	 delete@File( filename )( isDeleted )
     };

     getKey@twiceOP( "username" )( request.key );
     timeArray = "";
     content = "";
     request.x = 55;     
     for( i = 0, i < 100, i++ ) {
     	  getCurrentTimeMillis@Time()( startTime );
	  twice@twiceOP( request )( response );
	  getCurrentTimeMillis@Time()( endTime );
     	  time = endTime - startTime;	  
	  timeArray[i] = time;
//	  results[i] = response.y;
	  undef( startTime );
	  undef( endTime );
	  undef( time );
	  undef( response )
     };


     for( j = 0, j < #timeArray, j++ ) {
     	  content = content + timeArray[j] + "\n"
     };

     fileRequest.filename = filename;
     fileRequest.content = content;
     writeFile@File( fileRequest )()

/*     for( k = 0, k < #results, k++ ) {
     	  println@Console( results[k] )()
     }*/
}