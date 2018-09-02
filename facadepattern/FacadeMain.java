package facadepattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FacadeMain {

	//Hotel Cab and Flight datatypes, which the client has knowledge about. They could be provided in the same package as the Facade
	// All that the client needs to worry about is the Facade class 
	public static void main(String [] args) {
		TravelFacade travelFacade = new TravelFacade();
		
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String fromDateInString = "22-08-2018 10:20:56";
		String toDateInString = "27-08-2018 10:20:56";
		Date from = sdf.parse(fromDateInString);
		Date to = sdf.parse(toDateInString);

		travelFacade.displayTravelEssentialsFor(from, to);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
