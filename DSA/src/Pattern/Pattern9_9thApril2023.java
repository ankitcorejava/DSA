package Pattern;

/***************************
 * Pattern 9 ; https://nados.io/question/pattern-9?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern9_9thApril2023 {

	public static void printPattern9(int n) {

		for (int row = 1; row <= n; row++) {

			for(int col =1; col<=n; col++) {
				if((row==col)||(row+col== n+1)) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println("\t");
		}

	}

	public static void main(String[] args) {
		Pattern9_9thApril2023.printPattern9(5);

	}

}
