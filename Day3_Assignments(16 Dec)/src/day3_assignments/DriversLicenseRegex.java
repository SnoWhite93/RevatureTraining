package day3_assignments;

public class DriversLicenseRegex {
	public static void main(String[] args) {

		String dl = "L8509 20058 54727";
		if (dl.matches("[A-Z]{1,1}[0-9]{4} [0-9]{5} [0-9]{5}")) {
			System.out.println("Valid driver's license");
		} else {
			System.out.println("Invalid driver's license");
		}
	}
}
