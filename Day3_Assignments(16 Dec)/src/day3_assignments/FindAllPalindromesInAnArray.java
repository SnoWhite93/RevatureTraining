package day3_assignments;

public class FindAllPalindromesInAnArray {

	public static void main(String[] args) {

		int[] myArray = { 121, 45, 252, 33, 56, 565, 32, 666 };

		for (int i = 0; i < myArray.length; i++) {
			String element = String.valueOf(myArray[i]);
			if (isPalindrome(element) == true) {
				System.out.println(myArray[i]);

			}
		}
	}

	public static boolean isPalindrome(String b) {

		if (new StringBuffer(b).reverse().toString().equals(b)) {
			return true;
		} else {
			return false;
		}
	}
}
