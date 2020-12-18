package day3_assignments;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {

		int[] myArray = { 11, 2, 3, 8, 12, 28, 45, 66, 22 };
		System.out.println("Array before removing element: ");
		System.out.println(Arrays.toString(myArray));
		int arrLength = myArray.length; // 9
		int positionToRemove = 1; // array element 2

//     A[1] = A[2];
//     A[2] = A[3];
//     A[3] = A[4];
//     A[4] = A[5];
//     A[5] = A[6];
//     A[6] = A[7];
//     A[7] = A[8];

		for (int i = positionToRemove; i < arrLength - 1; i++) {
			myArray[i] = myArray[i + 1];
		}

		System.out.println();
		System.out.println("Array after removing element: ");

		int newArrLength = arrLength - 1;
		int[] secondArr = Arrays.copyOf(myArray, newArrLength);
		System.out.println(Arrays.toString(secondArr));

	}
}