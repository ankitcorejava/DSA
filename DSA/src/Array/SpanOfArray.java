package Array;

import java.util.Scanner;

public class SpanOfArray {
	public static void spanOfArrays(int[] nums) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			} else if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.print(max - min);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = scn.nextInt();
		}
		//int[] i = { 15, 30, 40, 4, 11, 9 };
		SpanOfArray.spanOfArrays(array);
	}

}
