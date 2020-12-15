package egloop;

public class PrimeNumber {
    
	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		
//		for ( int i = 1; i<=100; i++) {
//			if(isPrime(i)) {
//				System.out.println(i + " ");
//			}
//		}
	}
	
	public static boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				c++;
			}
		}
		if (c ==2) {
			b = true;
		}
		return b;
	}
	
//	Try to recreate the same
//	1) Create a class with a method which generates odd numbers beween the range
//	2) Create a class with method which generates fibonacci sequence 
//	3) Create a class with a method with checks if the given value is palindrome or not
//	
}
