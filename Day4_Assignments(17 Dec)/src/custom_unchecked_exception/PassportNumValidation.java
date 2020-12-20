package custom_unchecked_exception;

public class PassportNumValidation {
	public boolean isValid(String passportNum) {
		if (passportNum.matches("[0-9]{9}")) {
			return true;
		} else {
			return false;
		}
	}

	public void validatePassNum(String passportNum) {
		if (!isValid(passportNum)) {
			throw new InvalidPassportNumException(passportNum + " is not valid");
		}
	}
}
