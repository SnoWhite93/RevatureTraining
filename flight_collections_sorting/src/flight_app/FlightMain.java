package flight_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

public class FlightMain {
    
	public static void main(String[] args) {
		
	List<Flight> flightList = new ArrayList<>();
	flightList.add(new Flight(134, "AllStar", 345.33, 4.5f, true));
	flightList.add(new Flight(343, "NotYourBanana", 200.45, 3.7f, true));
	flightList.add(new Flight(174, "SnowBall", 555.6, 2.5f, true));
	flightList.add(new Flight(543, "Teriaky", 135.22, 4.3f, false));
	flightList.add(new Flight(109, "FlyHigh", 789.33, 4.2f, true));
	flightList.add(new Flight(288, "Frontier", 198.45, 1.4f, false));
	flightList.add(new Flight(188, "JetRed", 256.53, 4.5f, true));
	flightList.add(new Flight(111, "QuickAsLight", 485.17, 4.9f, false));
	
	System.out.println("Showing all flights: ");
	showFlights(flightList);
	
	Collections.sort(flightList);
	System.out.println("\n\nPrinting all products sorted by flight id: ");
	showFlights(flightList);
	
	
	Collections.sort(flightList, new FlightAvailabilityComparator());
	  System.out.println("\n\nPrinting flights sorted by availability");
	  showFlights(flightList);

	  Collections.sort(flightList, (f1, f2) -> {  
		  Double d1 = f1.getFlightCost();
		  Double d2 = f2.getFlightCost();
		  return d1.compareTo(d2);
		  
	  });
	  

	  Collections.sort(flightList, comparing(Flight::getFlightCost));
	  System.out.println("\n\nPrinting flights sorted by cost");
	  showFlights(flightList);
	  Collections.sort(flightList, comparing(Flight::getRatings).thenComparing(Flight::getFlightCost));
	  System.out.println("\n\nPrinting flights sorted by ratings and cost");
	  showFlights(flightList);
	  Collections.sort(flightList, comparing(Flight::getCompanyName));
	  System.out.println("\n\nPrinting flights sorted by name");
	  showFlights(flightList);

	}
	
	
	public static void showFlights(List<Flight> flightList) {
		
		for(Flight f : flightList){
			System.out.println(f);
		}
		
	}
}
