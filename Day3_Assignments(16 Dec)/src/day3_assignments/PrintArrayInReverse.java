package day3_assignments;

public class PrintArrayInReverse {
	public static void main(String[] args) {

		int[] myArray = { 10, 566, 78, 24, 23, 54, 545, 666, 22, 11, 4 };
		System.out.println("The array elements in reverse order are: ");

		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println(myArray[i] + " ");
		}
	}
}
