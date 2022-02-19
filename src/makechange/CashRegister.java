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
			System.out.println("Exact amount.");
		} else if (amountTendered < itemPrice) {
			System.out.println("Amount tendered is less than the purchase price.");
			System.out.println("Please redo transaction.");
			System.exit(0);
		} else if (amountTendered > itemPrice) {
			double difference = amountTendered - itemPrice;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			difference = Double.valueOf(df.format(difference));
			makeChange(difference);
		}

		System.out.println();
	}

	public static void makeChange(double difference) {
		System.out.println("Making change for: " + difference);

		// Make change ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c)
		int twenty = 0; // $20
		int ten = 0; // $10
		int five = 0; // $5
		int one = 0; // $1
		int quarter = 0; // $0.25
		int dime = 0; // $0.10
		int nickel = 0; // $0.05
		int penny = 0; // $0.01

		remaining = difference;
		// System.out.println("Remaining: " + remaining);

		if (remaining > 20.0) {
			twenty++;
			twenty *= remaining / 20.0;
			remaining = remaining % 20.0;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining > 10.0) {
			ten++;
			ten *= remaining / 10.0;
			remaining = remaining % 10.0;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining > 5.0) {
			five++;
			five *= remaining / 5.0;
			remaining = remaining % 5.0;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining >= 1.0) {
			one++;
			one *= remaining / 1.0;
			remaining = remaining % 1.0;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining >= 0.25) {
			quarter++;
			quarter *= remaining / 0.25;
			remaining = remaining % 0.25;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining >= 0.10) {
			dime++;
			dime *= remaining / 0.10;
			remaining = remaining % 0.10;
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining >= 0.05) {
			nickel++;
			nickel *= remaining / 0.05;
			remaining = remaining % 0.05;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}
		if (remaining >= 0.01) {
			penny++;
			penny *= remaining / 0.01;
			remaining = remaining % 0.01;

			// Precision round
			DecimalFormat df = new DecimalFormat("#.00");
			remaining = Double.valueOf(df.format(remaining));
			// System.out.println("New remainder: " + remaining);
		}

		System.out.println();
		System.out.println("-------- CHANGE --------");
		if (twenty != 0) {
			System.out.println("Twenty: " + twenty);
		}
		if (ten != 0) {
			System.out.println("Ten: " + ten);
		}
		if (five != 0) {
			System.out.println("Five: " + five);
		}
		if (one != 0) {
			System.out.println("One: " + one);
		}
		if (quarter != 0) {
			System.out.println("Quarter: " + quarter);
		}
		if (dime != 0) {
			System.out.println("Dime: " + dime);
		}
		if (nickel != 0) {
			System.out.println("Nickel: " + nickel);
		}
		if (penny != 0) {
			System.out.println("Penny: " + penny);
		}
		System.out.println("-------- DONE ----------");
	}
}
