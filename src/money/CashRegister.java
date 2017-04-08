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
			System.out.println("Change in bills: $" + bills);
			
			double cents = change - bills;
			cents = Math.round(cents * 100);
			//cents = cents / 100;
			System.out.println("cents: " + cents);
			//int coins = (int)cents * 100;
			//System.out.println(coins);

			giveBills(change, bills);
			giveCoins(cents);
		}
	} // end main

	public static void giveBills(double change, int bills) {
		// ten dollar bills
		while (bills != 0) {
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
				// bills = bills - (10 * tens + 5 * fives);
				ones = bills % 5;
				System.out.println(ones + " one dollar bills");
			}
		}
	}

	public static void giveCoins(double cents) {
		int coins = (int)cents;
		System.out.println("coins: " + coins);

		while (coins != 0) {
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			
			if (coins >= 25) {
				quarters = coins / 25;
				System.out.println(quarters + " quarters");
			}

			if (coins >= 10) {
				coins = coins - (25 * quarters);
				dimes = coins / 10;
				System.out.println(dimes + " dimes");
			}
			if (coins >= 5 && coins % 25 != 0 && coins % 10 !=0) {
				//coins = coins - 25 * quarters + 10 * dimes;
				nickels = coins % 5;
				System.out.println(nickels + " nickels");
			}
			if (nickels >= 1 || coins < 10) {
				pennies = coins % 5;
				System.out.println(pennies + " pennies");
				break;
			}
		}
	}
}
