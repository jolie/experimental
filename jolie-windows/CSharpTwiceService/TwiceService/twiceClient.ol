include "console.iol"
include "string_utils.iol"

type Person: void {
     .firstName: string
     .lastName: string
     .address: void {
     	   .streetName: string
	       .streetNumber: int
	       .zipCode: int
	       .city: string
     }
}

type PersonResponse: void {
     .personList*: void {
     .firstName: string
	 .lastName: string
	 .address: void {
     	   .streetName: string
	       .streetNumber: int
	       .zipCode: int
	       .city: string
          }
     }
}

type TwiceRequest: void {
     .x: int
}

type TwiceResponse: void {
     .y: int
}

interface twiceInterface {
	  RequestResponse: twice( TwiceRequest )( TwiceResponse )
}

interface personInterface {
	  RequestResponse: get( Person )( PersonResponse ), insert( Person )( PersonResponse ), delete( Person )( PersonResponse )
}

outputPort Main {
//	   Location: "socket://localhost:12002"
	   Location: "socket://localhost:9998"
	   Protocol: sodep
	   Interfaces: twiceInterface, personInterface
}

main
{
	println@Console( "Starting twice" )();
	twiceR.x = 10;
	twice@Main( twiceR )( resp );
	println@Console( "response: " + resp.y )();
	println@Console( "finished twice!" )();

	p.firstName = "Bergar";
	p.lastName = "Simonsen";
	p.address.streetName = "some street name";
	p.address.streetNumber = 5;
	p.address.zipCode = 555;
	p.address.city = "Copenhagen";

	println@Console( "Starting get person" )();
	println@Console( "The person does not exist so this should return all persons in the database" )();
	get@Main( p )( p_r );
	valueToPrettyString@StringUtils( p_r )( rs );
	println@Console( rs )();
	println@Console( "finished get person" )();

	println@Console( "Starting insert person" )();
	insert@Main( p )( p_resp );
	valueToPrettyString@StringUtils( p_resp )( p_resp_pretty );
	println@Console( p_resp_pretty )();
	println@Console( "Finished insert person" )();

	println@Console( "Starting get person" )();
	get@Main( p )( p_response );
	valueToPrettyString@StringUtils( p_response )( p_res );
	println@Console( p_res )();
	println@Console( "finished get person" )();

	println@Console( "Starting delete person" )();
	p2.firstName = "Sherlock";
	p2.lastName = "Holmes";
	p2.address.streetName = "Baker Street";
	p2.address.streetNumber = 21;
	p2.address.zipCode = 8889;
	p2.address.city = "London";
	delete@Main( p2 )( p2_resp );
	valueToPrettyString@StringUtils( r2_resp )( p2_resp_pretty );
	println@Console( p2_resp_pretty )();
	println@Console( "Finished delete person" )();
	
	println@Console( "Starting get person" )();
	get@Main( p2 )( p_response );
	valueToPrettyString@StringUtils( p_response )( p_res );
	println@Console( p_res )();
	println@Console( "finished get person" )()
}