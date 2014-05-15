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
outputPort twiceOP {
	   Location: "socket://localhost:9998"
	   Protocol: sodep
	   Interfaces: twiceInterface
}
inputPort twiceIP {
	  Location: "local"
	  Protocol: sodep
	  Aggregates: twiceOP
}
main {
     linkIn( nothing )
}