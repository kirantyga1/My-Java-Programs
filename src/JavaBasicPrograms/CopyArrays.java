package JavaBasicPrograms;
import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {

		/*
		 * String names[] = { "Smith", "Kohli", "Dhoni" }; String copyArray[] =
		 * names.clone(); System.out.println(Arrays.toString(names));
		 * System.out.println(Arrays.toString(copyArray));
		 */

		/*
		 * int names[] = { 1,2,3}; int copyArray[] = names.clone();
		 * System.out.println(Arrays.toString(names));
		 * System.out.println(Arrays.toString(copyArray));
		 */

		/*
		 * try { int arr1[] = { 1, 2, 3, 4, 5, 13 }; int arr2[] = { 6, 7, 8, 9, 10, 15
		 * }; int arr3[] = new int[12]; int index = 0; for (int i = 0; i < arr1.length;
		 * i++) { arr3[index++] = arr1[i]; arr3[index++] = arr2[i]; } for (int i = 0; i
		 * < arr3.length; i++) { System.out.print(arr3[i] + " "); } } catch (Exception
		 * e) { System.out.println("Array index out of bound exception"); }
		 */
		int arr[] = { 10, 14, 4, 3 };
		int size = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[1]);

	}
}