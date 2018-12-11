
public class IfElseDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		// Block scope example
		String sl = "yellow";
		String message;
		if (sl.equals("red")) {
			message = "stop!!!";
		}
		else if (sl.equalsIgnoreCase("yellow")) {
			message = "speed up or slow down";
		}
		else {
			message = "proceed through light";
		}
		
		System.out.println(message);
		
		
		System.out.println("Bye");
	}

}
