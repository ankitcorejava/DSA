package Array;

import java.util.Scanner;

public class MaxOfAnArray {

	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(MaxOfAnArray.maxOfArray(arr, n - 1));
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == -1) {
			return 0;
		}

		maxOfArray(arr, idx - 1);
		if (max < arr[idx]) {
			max = arr[idx];
		}
		return max;
	}

}
