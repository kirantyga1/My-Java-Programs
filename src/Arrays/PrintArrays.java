package Arrays;

import java.util.Scanner;

public class PrintArrays {
	public static void main(String[] args) {

		/*
		 * Scanner scn = new Scanner(System.in); int[] arr1 = new int[3];
		 * System.out.println("Enter array1 values:"); for (int i = 0; i < arr1.length;
		 * i++) { arr1[i] = scn.nextInt(); System.out.println(arr1[i]); } int[] arr2 =
		 * new int[3]; System.out.println("Enter array2 values:"); for (int i = 0; i <
		 * arr2.length; i++) { arr2[i] = scn.nextInt(); System.out.println(arr2[i]); }
		 */

		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
