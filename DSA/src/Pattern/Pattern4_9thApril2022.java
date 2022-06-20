package Pattern;

/***************************
 * Pattern 4 ; https://nados.io/question/pattern-4?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern4_9thApril2022 {

	public static void printPattern4(int n) {

		for (int row = 1; row <= n; row++) {

			// Spaces
			for (int spaces = 1; spaces <= row - 1; spaces++) {
				System.out.print("\t");
			}
			// Star
			for (int star = 1; star <= (n - (row - 1)); star++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern4_9thApril2022.printPattern4(5);

	}

}
