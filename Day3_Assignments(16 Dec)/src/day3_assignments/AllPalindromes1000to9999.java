package day3_assignments;

public class AllPalindromes1000to9999 {
	public static void main(String[] args) {

		for (int i = 1000; i <= 9999; i++) {
			String s = i + "";
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.print(i + " ");
			}
		}

	}
}
