package eg1;

public class Arithmetics {

	public static void main(String[] args) {

		int a = 32;
		int b = 11;

		int z = a - b;
		int y = a + b;
		int x = a / b;
		int w = a * b;
		int remainder = a % b;

		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		System.out.println(w);
		System.out.println(remainder);

		System.out.println(3 == 7);
		System.out.println(4 != 5);
		System.out.println(6 > 2);
		System.out.println(5 < 10);

		boolean isittrue = 5 > 9;
		System.out.println(isittrue);

		boolean but = 7 <= 9;
		System.out.println(but);
	}

}
