include "console.iol"

interface twiceInterface {
	  RequestResponse: twice( int )( int )
}

outputPort twiceOP {
	   Location: "socket://localhost:12002"
	   Protocol: sodep
	   Interfaces: twiceInterface
}

main
{
	println@Console( "starting!" )();
	twice@twiceOP( 10 )( resp );
	println@Console( "response: " + resp )()
}