include "console.iol"
type TwiceRequest:void {
     .x: int
}
type TwiceResponse: void {
     .y: int
}
interface twiceInterface {
	  RequestResponse: twice( TwiceRequest )( TwiceResponse )
}
outputPort twiceOP {
	   Location: "socket://localhost:9997"
	   Protocol: sodep
	   Interfaces: twiceInterface
}
main {
     request.x = 22;
     twice@twiceOP( request )( response );
     println@Console( "response: " + response.y )()
}