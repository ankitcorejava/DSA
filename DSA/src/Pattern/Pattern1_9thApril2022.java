package Pattern;

/***************************
 * Pattern 1 ; https://nados.io/question/pattern-1?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern1_9thApril2022 {
	
	public static void printPattern1(int n) {
		
		for(int i =1 ;i <= n; i++) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Pattern1_9thApril2022.printPattern1(5);
		
	}

}
