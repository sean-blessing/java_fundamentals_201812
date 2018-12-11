import java.util.InputMismatchException;
import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Table of Powers App");

		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter an integer:  ");
			try  {
				int num = sc.nextInt();
				
				System.out.print("Number\tSquared\tCubed\n" + 
						"======\t=======\t=====\n");
				for (int i=1; i<=num; i++) {
					int squared = i * i;
					int cubed = i * i * i;
					System.out.println(i + "\t" + squared + "\t" + cubed);
				}				
			}
			catch (InputMismatchException ime) {
				System.out.println("Exception occurred... try again.");
				sc.nextLine();
				continue;
			}
			System.out.println("Continue?(y/n) ");
			choice = sc.next();
		}
		
		System.out.println("Bye");
	}

}
