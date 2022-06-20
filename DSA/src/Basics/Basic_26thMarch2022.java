package Basics;

public class Basic_26thMarch2022 {

	// Count Digits in a Number
	// https://nados.io/question/count-digits-in-a-number?zen=true
	/**********
	 * Count Digits In A Number 1. You've to count the number of digits in a number.
	 * 2. Take as input "n", the number for which the digits has to be counted. 3.
	 * Print the digits in that number.
	 *********/

	public static int countDigits(int num) {
		int rev = 0;
		int reminder = 0;
		int icount = 0;
		while (num > 0) {
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
			icount++;
		}

		return icount;
	}

	/**********
	 * Reverse A Number 1. You've to display the digits of a number in reverse. 2.
	 * Take as input "n", the number for which digits have to be display in reverse.
	 * 3. Print the digits of the number line-wise, but in reverse order.
	 * 
	 ************/
	public static int reverseNum(int num) {
		int rev = 0;
		int reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
		}

		return rev;
	}

	/*******
	 * Pythagorean Triplet 1. You are required to check if a given set of numbers is
	 * a valid pythagorean triplet. 2. Take as input three numbers a, b and c. 3.
	 * Print true if they can form a pythagorean triplet and false otherwise.
	 * 
	 *******/
	public static boolean isPythagoreanTriplet(int a, int b, int c) {

		if (a > b && a > c) {
			if (a * a == b * b + c * c) {
				return true;
			}
		} else if (b > a && b > c) {
			if (b * b == a * a + c * c) {
				return true;
			}
		} else {
			if (c * c == a * a + b * b) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println("countDigits: " + Basic_26thMarch2022.countDigits(65784383));
		System.out.println("reverseNum: " + Basic_26thMarch2022.reverseNum(65784383));
		System.out.println("isPythagoreanTriplet: " + Basic_26thMarch2022.isPythagoreanTriplet(5,3,4));
	}

}
