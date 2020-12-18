package day3_assignments;

public class FindMinAndMaxInAnArray {
	public static void main(String[] args) {

		int[] myArray = { 11, 78, 43, 23, 8888, 66, 2, 77, 124, -555, 775 };
		int max = myArray[0];
		int min = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}

		System.out.println(max);
		System.out.println(min);
	}
}
