package eg1;

public class Demo1 {
	public static void main(String[] args) {

		System.out.println(sumOfNumbers(10, 2, 1, 3));

	}

	public static int sumOfNumbers(int ...a) {
    	   int sum = 0;
    	   for (int i : a) {
    		   sum=sum+i;
    	   }
    	   return sum;
       }
}

/*
 * represents var args
 * it takes any number of values a s input only rule is that it should be the
 * last parameter of your method
 */
