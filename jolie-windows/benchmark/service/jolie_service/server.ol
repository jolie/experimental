type TwiceRequest:void {
     .x: int
}
type TwiceResponse: void {
     .y: int
}
interface twiceInterface {
	  RequestResponse: twice( TwiceRequest )( TwiceResponse )
	  OneWay: shutdown( void )
}
execution { concurrent }
inputPort twiceIP {
	  Location: "local"
	  Protocol: sodep
	  Interfaces: twiceInterface
}
main {
     twice( request )( response ) {
     	    response.y = request.x * 2
     }
}