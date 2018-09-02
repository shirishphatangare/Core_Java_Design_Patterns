package facadepattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelBooking {

	
	public List<Hotel> getHotelsFor(Date from, Date to){
		List<Hotel> hotelsList = new ArrayList<>();
		hotelsList.add(new Hotel("Hotel Marriot"));
		hotelsList.add(new Hotel("Hotel Stargaze"));
		hotelsList.add(new Hotel("Hotel Galaxy"));
		return hotelsList;
	} 
	
}
