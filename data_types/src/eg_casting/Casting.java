package eg_casting;

public class Casting {
   
	/*  conversion of one data type to another 
	 * 2 types:
	 * implicit casting - taken care by java compiler when the smaller data type is assigned to the larger
	 * data type
	 * 
	 * */
	
	public static void main(String[] args) {
		int x = 100;
		float m = x; 
//		implicit casting
		System.out.println("x= "+ x);
		System.out.println("m= "+ m);
		
		
		m = 89.975f;
		System.out.println(m);
		double d = m; 
		System.out.println(d);
//		implicit casting 
		
		/*
		 * Explicit casting, when we would like to convert the larger type to the smaller one
		 * 
		 * */
		
		char c = 'Y';
		int q = c;
		System.out.println("q :" + q);
		q++;
		
//		c=q; not working cause you cannot cast small
		c=(char)q;
		
	System.out.println("c :" + c);
	
	
	System.out.println("m = " + m);
	x = (int)m;
	System.out.println("x = " + x);
	}
	
	
	
}
