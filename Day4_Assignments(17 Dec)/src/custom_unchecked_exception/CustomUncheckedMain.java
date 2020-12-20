package custom_unchecked_exception;

public class CustomUncheckedMain {
	public static void main(String[] args) {
		PassportNumValidation validation = new PassportNumValidation();
		try {
			String passNum1 = "876117228";
			validation.validatePassNum(passNum1);
			System.out.println(passNum1 + " is valid");
		} catch (InvalidPassportNumException e) {
			System.out.println(e.getMessage());
		}

		try {
			String passNum2 = "8Z76117a228";
			validation.validatePassNum(passNum2);
			System.out.println(passNum2 + " is valid");
		} catch (InvalidPassportNumException e) {
			System.out.println(e.getMessage());
		}
	}
}
