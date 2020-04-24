package Arrays;

import java.util.Arrays;

public class LargestSmallestnumbersinanArray {

	public static void main(String[] args) {

		int numbers[] = { -22, -10, 4, 2, 1, 8, 12, 99 };
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Given Array elements are :" + Arrays.toString(numbers));
		System.out.println(largest);
		System.out.println(smallest);

	}

}
