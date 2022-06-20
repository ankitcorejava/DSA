package Basics;

public class Basic_29thMarch2022 {

	/**********
	 * Is A Number Prime 1. You've to check whether a given number is prime or not.
	 * 2. Take a number "t" as input representing count of input numbers to be
	 * tested. 3. Take a number "n" as input "t" number of times. 4. For each input
	 * value of n, print "prime" if the number is prime and "not prime" otherwise.
	 * 
	 ***********/
	public static void isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("not prime");
				return;
			}
		}

		System.out.println("prime");

	}
	
	public static void main(String[] args) {
		Basic_29thMarch2022.isPrime(13);
		Basic_29thMarch2022.isPrime(2);
	}

}
