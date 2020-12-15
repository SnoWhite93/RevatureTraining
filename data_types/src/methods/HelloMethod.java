package methods;

import eg2.AnotherPack;

public class HelloMethod {
   
	public static void main(String[] args) {
		
//		method name directly if the static method is of same class
		iAmStatic();
		iAmStatic("dog");
		
//		classname.method name to access static methods of another class 
		SecondClass.iAmStaticSecond();
		SecondClass.iAmStaticSecond("play");
		
		AnotherPack.iAmAnoPack();
		AnotherPack.iAmAnoPack("coconut");
//		classname objname = new(dynamic memory allocation) Constructor();
//
		HelloMethod h = new HelloMethod(); 
		h.IamNotStatic();
		h.IamNotStaticAgain();
		SecondClass s = new SecondClass();
		s.iAmNotStatSecond();
		
		
	}
	
	public static void iAmStatic( ) {
		System.out.println("Hello static");
	}
	
	public static void iAmStatic(String name) {
		System.out.println("Hello static with name " + name);
	}
	
	public void IamNotStatic() {
		System.out.println("Non static meth of HelloMethod class");
	}
	
	public void IamNotStaticAgain() {
		System.out.println("Non static meth again of HelloMethod class");
	}
}
