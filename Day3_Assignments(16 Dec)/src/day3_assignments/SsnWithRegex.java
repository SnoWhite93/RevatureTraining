package day3_assignments;

public class SsnWithRegex {

	public static void main(String[] args) {
		String ssn = "417-08-3950";
		if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid ssn");
		} else {
			System.out.println("Invalid ssn");
		}
	}
}
