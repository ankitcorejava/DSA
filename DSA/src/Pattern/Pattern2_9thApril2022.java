package Pattern;

/***************************
 * Pattern 2 ; https://nados.io/question/pattern-2?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern2_9thApril2022 {

	public static void printPattern2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern2_9thApril2022.printPattern2(5);

	}

}
