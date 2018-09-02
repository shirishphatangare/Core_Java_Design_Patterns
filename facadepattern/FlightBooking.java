package facadepattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBooking {
	public List<Flight> getFlightsFor(Date from, Date to){
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight("Flight Alligiant"));
		flightList.add(new Flight("Flight United Airlines"));
		flightList.add(new Flight("Flight Frontier"));
		return flightList;
	} 
}
