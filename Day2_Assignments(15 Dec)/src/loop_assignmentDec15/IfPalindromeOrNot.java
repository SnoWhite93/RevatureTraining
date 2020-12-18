package loop_assignmentDec15;

public class IfPalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Hi, I'm a Palindrome!");

		String origString = "civic";

		String reverseString = new StringBuilder(origString).reverse().toString();

		if (origString.equals(reverseString)) {
			System.out.println(origString + " is palindrome");
		} else {
			System.out.println(origString + " is not");
		}
	}

}
