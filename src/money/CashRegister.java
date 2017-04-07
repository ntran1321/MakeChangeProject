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
		
		
		// Need a method to calculate change
		// Need a method to handle user input
		

	}

}
