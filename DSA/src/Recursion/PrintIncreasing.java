package Recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		printDecreasing(i);
	}

	public static void printDecreasing(int n) {

		if (n == 0) {
			return;
		}
		printDecreasing(n - 1);
		System.out.println(n);
		

	}

}
