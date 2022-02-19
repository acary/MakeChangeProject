package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		getItemPrice(kb);
		getAmountTendered(kb);
		comparePriceToTendered();
		makeChange();
		
	}
	
	public static void getItemPrice(Scanner kb) {
		double itemPrice = 0;
		System.out.println("Provide item price:");
		itemPrice = kb.nextDouble();
	}
	
	public static void getAmountTendered(Scanner kb) {
		double amountTendered = 0;
		System.out.println("Enter amount tendered:");
		amountTendered = kb.nextDouble();
	}
	
	public static void comparePriceToTendered() {
		System.out.println("Checking...");
	}
	
	public static void makeChange() {
		System.out.println("Making change...");
	}

}
