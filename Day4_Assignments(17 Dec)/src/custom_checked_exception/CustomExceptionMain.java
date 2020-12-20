package custom_checked_exception;

public class CustomExceptionMain {
	public static void main(String[] args) {
		DLValidation validation = new DLValidation();
		try {
			String dl1 = "L8509 20058 54727";
			validation.validateNJDriversLicense(dl1);
			System.out.println(dl1 + " is valid");
		} catch (InvalidDLNumException e) {
			System.out.println(e.getMessage());
		}

		try {
			String dl2 = "L8509 208 54727";
			validation.validateNJDriversLicense(dl2);
			System.out.println(dl2 + " is valid"); // will not execute because of line 17
		} catch (InvalidDLNumException e) {
			System.out.println(e.getMessage());
		}
	}
}
