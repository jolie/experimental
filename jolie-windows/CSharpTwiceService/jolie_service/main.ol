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