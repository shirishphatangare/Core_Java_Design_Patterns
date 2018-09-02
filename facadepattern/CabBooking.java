package facadepattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CabBooking {
	public List<Cab> getCabsFor(Date from, Date to){
		List<Cab> cabList = new ArrayList<>();
		cabList.add(new Cab("Uber"));
		cabList.add(new Cab("AirCity"));
		cabList.add(new Cab("AirCabs"));
		return cabList;
	} 
}
