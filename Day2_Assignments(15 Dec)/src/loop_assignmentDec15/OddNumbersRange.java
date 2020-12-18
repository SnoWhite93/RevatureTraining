package loop_assignmentDec15;

import java.util.Scanner;

public class OddNumbersRange {

	public static void main(String[] args) {
		System.out.println("Hello Odd Numbers assignment! ");
		Range();

	}

	public static void Range() {
		int a, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number for range: ");
		int firstNum = scan.nextInt();
		System.out.println("Enter the last number for range: ");
		int lastNum = scan.nextInt();

		scan.close();

		for (i = firstNum; i <= lastNum; i++) {
			a = i % 2;
			if (a != 0) {
				System.out.println(i);
			}

		}

	}
}
