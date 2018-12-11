
public class ProductDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product app");
		
		// create an instance of product named p1
		Product p1 = new Product("java", "Murach's Java", 59.50);
		
		System.out.println("new product = "+p1);
		
		Product p2 = new Product();
		p2.setCode("andr");
		p2.setDescription("Murach's Android Programming");
		p2.setPrice(52.50);
		
		System.out.println(p2);
		System.out.println("Bye");
	}

}
