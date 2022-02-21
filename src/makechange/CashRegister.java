package makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegister {

	static double itemPrice = 0;
	static double amountTendered = 0;
	static double remaining = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		getItemPrice(kb);
		getAmountTendered(kb);
	}

	public static void getItemPrice(Scanner kb) {
		System.out.println("Provide item price:");
		itemPrice = kb.nextDouble();
		System.out.println();
	}

	public static void getAmountTendered(Scanner kb) {
		System.out.println("Enter amount tendered:");
		amountTendered = kb.nextDouble();
		System.out.println();
		comparePriceToTendered();
	}

	public static void comparePriceToTendered() {
		if (itemPrice == amountTendered) {
			closeTransaction();
		} else if (amountTendered < itemPrice) {
			throw new RuntimeException("Amount tendered is less than the purchase price.");
		} else if (amountTendered > itemPrice) {
			double difference = amountTendered - itemPrice;
			difference = formatDouble(difference);
			makeChange(difference);
			closeTransaction();
		}
		System.out.println();
	}

	public static double formatDouble(double difference) {
		DecimalFormat df = new DecimalFormat("#.00");
		difference = Double.valueOf(df.format(difference));
		return difference;
	}

	public static void makeChange(double difference) {
		// System.out.println("Making change for: " + difference);
		int twenty = 0; // $20
		int ten = 0; // $10
		int five = 0; // $5
		int one = 0; // $1
		int quarter = 0; // $0.25
		int dime = 0; // $0.10
		int nickel = 0; // $0.05
		int penny = 0; // $0.01

		remaining = difference;
		if (remaining >= 20.0) {
			twenty++;
			twenty *= remaining / 20.0;
			remaining = remaining % 20.0;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 10.0) {
			ten++;
			ten *= remaining / 10.0;
			remaining = remaining % 10.0;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 5.0) {
			five++;
			five *= remaining / 5.0;
			remaining = remaining % 5.0;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 1.0) {
			one++;
			one *= remaining / 1.0;
			remaining = remaining % 1.0;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 0.25) {
			quarter++;
			quarter *= remaining / 0.25;
			remaining = remaining % 0.25;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 0.10) {
			dime++;
			dime *= remaining / 0.10;
			remaining = remaining % 0.10;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 0.05) {
			nickel++;
			nickel *= remaining / 0.05;
			remaining = remaining % 0.05;
			remaining = formatDouble(remaining);
		}
		if (remaining >= 0.01) {
			penny++;
			penny *= remaining / 0.01;
			remaining = remaining % 0.01;
			remaining = formatDouble(remaining);
		}

		System.out.println("-------- CHANGE --------");
		System.out.println();
		if (twenty != 0) {
			System.out.println("$20:\t" + twenty);
		}
		if (ten != 0) {
			System.out.println("$10:\t" + ten);
		}
		if (five != 0) {
			System.out.println("$5:\t" + five);
		}
		if (one != 0) {
			System.out.println("$1:\t" + one);
		}
		if (quarter != 0) {
			System.out.println(".25c:\t" + quarter);
		}
		if (dime != 0) {
			System.out.println(".10c:\t" + dime);
		}
		if (nickel != 0) {
			System.out.println(".05c:\t" + nickel);
		}
		if (penny != 0) {
			System.out.println(".01c:\t" + penny);
		}
	}

	public static void closeTransaction() {
		System.out.println();
		System.out.println("-------- DONE ----------");
	}
}
