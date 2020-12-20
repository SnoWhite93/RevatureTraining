package custom_unchecked_exception;

public class InvalidPassportNumException extends RuntimeException {
//  public InvalidPassportNumException() {
//  }

	public InvalidPassportNumException(String message) {
		super(message);
	}
}
