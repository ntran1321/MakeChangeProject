package money;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter purchase price
		System.out.print("Purchase price: $");
		double price = input.nextDouble();
		
		// Prompt user to enter tender amount
		System.out.print("Tender amount: $");
		double tender = input.nextDouble();
		
		// Too little or exact amount
		if (price == tender) {
			System.out.println("No change due.");
		}
		else {
			double change = tender - price;
			System.out.println("Change due: $" + change);
			int bills;
			bills = (int)change;
			System.out.println("Change in bills: $" + bills);
			
			double cents = change - bills;
			System.out.println("cents: " + cents);	
			
			giveBills(change, bills);
			giveCoins(change, bills);
		}
	} //end main
	
	public static void giveBills(double change, int bills){
		// ten dollar bills
		int tens = bills / 10;
		int fives = 0;
		int ones = 0;
		System.out.println(tens + " ten dollar bills");
		
		if (tens >= 1) {
			bills = bills - 10 * tens;
			fives = bills / 5;
			System.out.println(fives + " five dollar bills");
		}
		
		if (fives >= 1) {
			//bills = bills - (10 * tens + 5 * fives);
			ones = bills % 5;
			System.out.println(ones + " one dollar bills");
		}
		
		
//		if (bills >= 10 && bills % 5 != 0) {
//			int tens = bills % 10;
//			System.out.println("Give back " + tens + " ten dollar bill(s)");
//		}
//		if (bills < 5) {
//			System.out.println("Give back " + bills + " one dollar bill(s)");
//		}
//		if (bills % 10 != 0 && bills >= 5) {
//			int fives = bills / 5;
//			System.out.println("Give back " + fives + " five dollar bill(s)");
//		}
//		
		
		
			
		// to find cents, keep decimals
		// take price minus output of floor function
		
		// one dollar
		// five dollar
		// ten dollar
	}
	
	public static void giveCoins(double change, int bills){
		if (change < 1) {
				
			}		
		
				// penny
				// nickel
				// dime
				// quarter
	}
}
