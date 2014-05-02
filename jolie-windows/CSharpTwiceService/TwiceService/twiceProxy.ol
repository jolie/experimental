include "console.iol"

interface twiceInterface {
	  RequestResponse: twice( int )( int )
}

/*
outputPort proxy {
	   Location: "local"
	   Protocol: sodep
	   Interfaces: twiceInterface
} */

inputPort twiceIP {
	  Location: "local"
	  Protocol: sodep
}

main
{
	linkIn( nothing )
}