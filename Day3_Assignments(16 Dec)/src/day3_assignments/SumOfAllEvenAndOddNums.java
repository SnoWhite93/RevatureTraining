package day3_assignments;

public class SumOfAllEvenAndOddNums {
	public static void main(String[] args) {

		int[] wholeArr = { 13, 1, 3, 2, 5, 6, 55, 73, 57, 357, 5 };
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < wholeArr.length; i++) {
			if (wholeArr[i] % 2 == 0) {
				evenSum = evenSum + wholeArr[i];
			} else {
				oddSum = oddSum + wholeArr[i];
			}
		}
		System.out.println("evenSum = " + evenSum);
		System.out.println("oddSum = " + oddSum);

		int max = Math.max(evenSum, oddSum);
		System.out.println("The maximum value is = " + max);
	}
}
