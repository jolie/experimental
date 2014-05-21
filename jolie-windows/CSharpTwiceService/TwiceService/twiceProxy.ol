include "console.iol"
type Person*: void {
     .firstName: string
     .lastName: string
     .address: void {
     	       .streetName: string
	       .streetNumber: int
	       .zipCode: int
	       .city: string
     }
}
type TwiceRequest: void {
     .x: int
}
type TwiceResponse: void {
     .y: int
}
interface twiceInterface {
	  RequestResponse: twice( int )( int )
}
interface personInterface {
	  RequestResponse: get( Person )( Person ), insert( Person )( Person ), delete( Person )( Person )
}
outputPort proxy {
	   Location: "socket://localhost:9998"
	   Protocol: sodep
	   Interfaces: twiceInterface, personInterface
}
inputPort twiceIP {
	  Location: "local"
	  Protocol: sodep
	  Aggregates: proxy
}
main {
	linkIn( nothing )
}