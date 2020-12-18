package loop_assignmentDec15;

public class FibonacciSequence {
	public static void main(String[] args) {

		System.out.println("Hello Fibonacci number!");
		fib();

	}

	public static void fib() {

		int count = 13;
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= count; i++) {
			System.out.println(num1 + " ");

			int theSumofprevioursTwoNums = num1 + num2;
			num1 = num2;
			num2 = theSumofprevioursTwoNums;
		}
	}

}
