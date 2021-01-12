package flight_app;

public class Flight implements Comparable<Flight> {
    
	private int flightId;
	private String companyName;
	private double flightCost;
	private float ratings;
	private boolean available;
	
	public Flight() {
		
	}

	public Flight(int flightId, String companyName, double flightCost, float ratings, boolean available) {
		super();
		this.flightId = flightId;
		this.companyName = companyName;
		this.flightCost = flightCost;
		this.ratings = ratings;
		this.available = available;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getFlightCost() {
		return flightCost;
	}

	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", companyName=" + companyName + ", flightCost=" + flightCost
				+ ", ratings=" + ratings + ", available=" + available + "]";
	}

	@Override
	public int compareTo(Flight o) {
		Integer flightId1 = this.flightId;
        Integer flightId2 = o.flightId;
        
        return flightId1.compareTo(flightId2);
	}
	
	
	
}
