import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello world!!!"); 

		int x = 14;
		double y = 15.5;
		double z = 16;
		
		String message = "The number z = \n" + z;

		
		System.out.println(message);
		
		y += x;
		System.out.println(y);
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a sentence");
//		String s1 = sc.nextLine();
//		System.out.println("s1 = "+s1);
//		
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
//		
//		System.out.print("Enter a double: ");
//		double b = sc.nextDouble();
//		
//		System.out.println("a = "+a+", b = "+b);
//		
		int i = 0;
		int sum = 0;
		while (i < 10) {
			sum += i;
			System.out.println(sum);
			i++;
		}
		sc.close();
	}

}
