import java.text.NumberFormat;
import java.util.Scanner;

public class FunWithNumbersApp {

	public static void main(String[] args) {
		//  Generate a random # between 1 and 6 (dice roll)
		int d = (int)(Math.random()*6)+1;
		System.out.println("random # = "+d);

		//Use NumberFormat to format a double
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a price: ");
		double price = sc.nextDouble();
		System.out.println("price = "+price);
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("formatted price = "+cf.format(price));
		
		System.out.print("Enter a percentage:  ");
		double pct = sc.nextDouble();
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(3);
		
		System.out.println("pct = "+pct);
		System.out.println("formatted pct = "+pf.format(pct));
	}

}
