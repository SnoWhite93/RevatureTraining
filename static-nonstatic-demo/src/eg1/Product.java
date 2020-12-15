package eg1;

public class Product {
   
	String name; // global instance obj
	double price; //global instance var
//	common for all products
	private static float discount = 5.5f; //global class level var
	
	public static void main(String[] args) {

		
		
		Product p1 = new Product();
		p1.name = "Television";
		p1.price = 67.88;
		System.out.println("Printing p1");
		p1.printProduct();
		
		discount = 7.24f;
		
		Product p2  = new Product();
		p2.name = "kitchen";
		p2.price = 65.88;
		System.out.println("\nPrinting p2");
		p2.printProduct();
		
		System.out.println("\nPrinting p1 again");
		p1.printProduct();
		
		
	}
	
	public void printProduct() {
		System.out.println("Product Name = " + name);
		System.out.println("Product price = " + price);
		System.out.println("Discount = " + discount);
	} 
}
