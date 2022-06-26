package Array;

import java.util.Scanner;

public class FindElementInAnArray {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}
		int d = scan.nextInt();

		System.out.println(findElement(n, d, list));

	}

	public static int findElement(int n, int d, int[] list) {
		for (int j = 0; j < n; j++) {
			if (list[j] == d) {
				return j;
			}
		}
		return -1;
	}

}
