import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		Scanner sc = new Scanner(System.in);
		
		String choice = getString("Roll the dice (y/n) ? ", sc);
		while (choice.equalsIgnoreCase("y")) {
			int die1 = rollDie();
			int die2 = rollDie();
			
			displayResults(die1, die2);
			
			choice = getString("Roll again (y/n) ? ", sc);
		}
		
		System.out.println("Bye");
	}
	
	private static String getString(String prompt, Scanner scan) {
		System.out.print(prompt);
		String s = scan.next();
		return s;
	}
	
	private static int rollDie() {
		return (int)(Math.random()*6 +1);
	}
	
	private static void displayResults(int d1, int d2) {
		System.out.println("Die1:  "+d1);
		System.out.println("Die2:  "+d2);
		int sum = d1 + d2;
		System.out.println("Total: "+sum);
		if (sum==2)
			System.out.println("Snake Eyes!");
		else if (sum==12)
			System.out.println("Box Cars!");
	}

}
