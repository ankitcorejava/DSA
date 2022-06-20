package Pattern;

import java.util.Scanner;

/***************************
 * Pattern 9 ; https://nados.io/question/pattern-9?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern5_9thApril2022 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int star = 1;
		int space = n / 2;
		for (int row = 1; row <= n; row++) {

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*\t");
			}

			if (row <= n / 2) {
				space = space - 1;
				star = star + 2;
			} else {
				space = space + 1;
				star = star - 2;
			}
			System.out.println();
		}
	}
}
