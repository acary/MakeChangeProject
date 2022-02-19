package makechange;

import java.util.Scanner;

public class CashRegister {
	
	static double itemPrice = 0;
	static double amountTendered = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		getItemPrice(kb);
		getAmountTendered(kb);
		comparePriceToTendered();
		makeChange();
		
	}
	
	public static void getItemPrice(Scanner kb) {
		System.out.println("Provide item price:");
		itemPrice = kb.nextDouble();
	}
	
	public static void getAmountTendered(Scanner kb) {
		System.out.println("Enter amount tendered:");
		amountTendered = kb.nextDouble();
	}
	
	public static void comparePriceToTendered() {
		System.out.println("Checking...");
		
		// TODO: Compare price to tendered
	}
	
	public static void makeChange() {
		System.out.println("Making change...");
		
		// TODO: Make change
		
		System.out.println("Done.");
	}

}
