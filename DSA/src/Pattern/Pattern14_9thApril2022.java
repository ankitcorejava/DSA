package Pattern;

/***************************
 * Pattern 9 ; https://nados.io/question/pattern-9?zen=true 1. You are given a
 * number n. 2. You've to create a pattern of * and separated by tab as shown in
 * output format.
 * 
 **************************/
public class Pattern14_9thApril2022 {

	public static void printPattern14(int table) {

		 for(int i=1; i<=10; i++ ){
             System.out.println(table+" * "+i+" = "+(table*i));
       }

	}

	public static void main(String[] args) {
		Pattern14_9thApril2022.printPattern14(5);

	}

}
