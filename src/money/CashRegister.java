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

		input.close();

		// Too little or exact amount
		if (price == tender) {
			System.out.println("No change due.");
		} else if (price > tender) {
			System.out.println("You owe me more money.");
		} else {
			double change = tender - price;
			System.out.println("Change due: $" + change);
			int bills;
			bills = (int) change;

			double cents = change - bills;
			cents = Math.round(cents * 100);

			giveBills(change, bills);
			giveCoins(cents);
		}
	} // end main

	public static void giveBills(double change, int bills) {
		int tens = 0;
		int fives = 0;
		int ones = 0;
		if (bills >= 10) {
			tens = bills / 10;
			System.out.println(tens + " ten dollar bills");
		}

		if (tens >= 1) {
			bills = bills - 10 * tens;
			fives = bills / 5;
			System.out.println(fives + " five dollar bills");
		}

		if (fives >= 1 || bills < 5) {
			ones = bills % 5;
			System.out.println(ones + " one dollar bills");
		}
	}

	public static void giveCoins(double cents) {
		int coins = (int) cents;
		int quarters = coins / 25;
		if (quarters > 0) {
			coins = coins % 25;
			System.out.println(quarters + " quarters");
		}
		int dimes = coins / 10;
		if (dimes > 0) {
			coins = coins % 10;
			System.out.println(dimes + " dimes");
		}
		int nickels = coins / 5;
		if (nickels > 0) {
			coins = coins % 5;
			System.out.println(nickels + " nickels");
		}
		int pennies = coins;
		if (coins % 5 > 0) {
			pennies = coins % 5;
			System.out.println(pennies + " pennies");
		}

	}
}
