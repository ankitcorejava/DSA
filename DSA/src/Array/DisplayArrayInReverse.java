package Array;

import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int idx = scn.nextInt();
		int[] arr = new int[idx];
		for (int i = 0; i < idx; i++) {
			arr[i] = scn.nextInt();
		}
		DisplayArrayInReverse.displayArrReverse(arr, idx-1);
	}

	public static void displayArrReverse(int[] arr, int idx) {

		if (idx == -1) {
			return;
		}

		System.out.println(arr[idx]);
		displayArrReverse(arr, idx - 1);

	}

}
