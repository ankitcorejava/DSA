package Recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		printIncreDecreasing(i);
	}

	public static void printIncreDecreasing(int n) {

		if (n == 0) {
			return;
		}
		System.out.println(n);
		printIncreDecreasing(n - 1);
		System.out.println(n);

	}

}
