package custom_checked_exception;

public class DLValidation {

	public boolean isValid(String dlNum) {

		if (dlNum.matches("[A-Z]{1,1}[0-9]{4} [0-9]{5} [0-9]{5}")) {
			return true;
		} else {
			return false;
		}
	}

	public void validateNJDriversLicense(String dlNum) throws InvalidDLNumException {

		if (!isValid(dlNum)) {
			throw new InvalidDLNumException(dlNum + " is not valid");
		}
	}
}
