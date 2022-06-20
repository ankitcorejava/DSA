package Pattern;

/***************************
 * Pattern 3 ; https://nados.io/question/pattern-3?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern3_9thApril2022 {

	public static void printPattern3(int n) {

		for (int row = 1; row <= n; row++) {

			// Spaces
			for (int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print(" ");
			}
			// Star
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern3_9thApril2022.printPattern3(5);

	}

}
