package facadepattern;

import java.util.Date;
import java.util.List;

//TravelFacade class allows the user to get their Hotel and Flight information in one call
public class TravelFacade {

	private HotelBooking hotelBooker = new HotelBooking();
	private FlightBooking flightBooker = new FlightBooking();
	private CabBooking cabBooker = new CabBooking();
	
	public void displayTravelEssentialsFor(Date from, Date to) {
		List<Hotel> hotelsList = hotelBooker.getHotelsFor(from, to);
		List<Flight> flightsList = flightBooker.getFlightsFor(from, to);
		List<Cab> cabsList = cabBooker.getCabsFor(from, to);
		
		System.out.println("Printing Hotel Information..");

		for(Hotel hotel:hotelsList) {
			System.out.println(hotel);
		}
		
		System.out.println("Printing Flight Information..");

		for(Flight flight:flightsList) {
			System.out.println(flight);
		}

		System.out.println("Printing Cab Information..");

		for(Cab cab:cabsList) {
			System.out.println(cab);
		}

		
	}
	
	
}
