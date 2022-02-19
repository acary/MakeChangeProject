package makechange;

import java.util.Scanner;

public class CashRegister {
	
	static double itemPrice = 0;
	static double amountTendered = 0;
	static double newDiff = 0;

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
		}
		else if (amountTendered < itemPrice) {
			System.out.println("Amount tendered is less than the purchase price.");
			System.out.println("Please redo transaction.");
			System.exit(0);
		}
		else if (amountTendered > itemPrice ) {
			double difference = amountTendered - itemPrice;
			makeChange(difference);
		}
		
		System.out.println();
	}
	
	public static void makeChange(double difference) {
		System.out.println("Making change for: " + difference);
		
		// TODO: Make change ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c)
		int twenty =  0; // $20
		int ten = 0; // $10
		int five = 0; // $5
		int one = 0; // $1
		int quarter = 0; // $0.25
		int dime = 0; // $0.10
		int nickel = 0; // $0.05
		int penny = 0; // $0.01
		
		double remaining = difference;
		System.out.println("Remaining: " + remaining);
		
		if (remaining > 20.0) {
			twenty++;
			twenty *= remaining / 20.0;
			remaining = remaining % 20.0;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 10.0) {
			ten++;
			ten *= remaining / 10.0;
			remaining = remaining % 10.0;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 5.0) {
			five++;
			five *= remaining / 5.0;
			remaining = remaining % 5.0;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 1.0) {
			one++;
			one *= remaining / 1.0;
			remaining = remaining % 1.0;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 0.25) {
			quarter++;
			quarter *= remaining / 0.25;
			remaining = remaining % 0.25;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 0.10) {
			dime++;
			dime *= remaining / 0.10;
			remaining = remaining % 0.10;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 0.05) {
			nickel++;
			nickel *= remaining / 0.05;
			remaining = remaining % 0.05;
			System.out.println("New remainder: " + remaining);
		}
		if (remaining > 0.01) {
			penny++;
			penny *= remaining / 0.01;
			remaining = remaining % 0.01;
			System.out.println("New remainder: " + remaining);
		}
		
//		while (remaining > 0.0) {
//			if (remaining % 20 == 0.0) {
//				if (remaining > 0.0) {
//					twenty = twenty + 1;
//					twenty *= twenty / 20;
//					remaining = remaining - (twenty * 20.0);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 10 == 0.0) {
//				if (remaining > 0.0) {
//					ten = ten + 1;
//					ten *= ten / 10;
//					remaining = remaining - (ten * 10.0);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 5 == 0.0) {
//				if (remaining > 0.0) {
//					five = five + 1;
//					five *= five / 5;
//					remaining = remaining - (five * 5.0);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 1 == 0.0) {
//				if (remaining > 0.0) {
//					one = one + 1;
//					one *= remaining / 1;
//					remaining = remaining - (one * 1.0);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 0.25 == 0.0) {
//				if (remaining > 0.0) {
//					quarter = quarter + 1;
//					quarter *= quarter / 0.25;
//					remaining = remaining - (quarter * 0.25);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 0.10 == 0.0) {
//				if (remaining > 0.0) {
//					dime = dime + 1;
//					dime *= dime / 0.10;
//					remaining = remaining - (dime * 0.10);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 0.05 == 0.0) {
//				if (remaining > 0.0) {
//					nickel = nickel + 1;
//					nickel *= nickel / 0.05;
//					remaining = remaining - (nickel * 0.05);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//			if (remaining % 0.01 == 0.0) {
//				if (remaining > 0.0) {
//					penny = penny + 1;
//					penny *= penny / 0.01;
//					remaining = remaining - (penny * 0.01);
//					System.out.println("New remainder: " + remaining);
//				}
//			}
//		}
		
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
