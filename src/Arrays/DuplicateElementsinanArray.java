package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinanArray {

	public static void main(String[] args) {

		// #1 Worst approach (Because time complexity will be very high=O(n*n))
		String names[] = { "Java", "C", "Ruby", "Java", "Ruby", "Python", "Java" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate course is::" + names[i]);
				}
			}
		}
		System.out.println("*******************************");

		// #2 Good approach, Time complexity is O(n)
		Set<String> store = new HashSet<>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate course is:: " + name);
			}
		}
		System.out.println("*******************************");

	}

}
