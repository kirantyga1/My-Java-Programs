package strings;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next();
		int myInt = scanner.nextInt();

		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);

	}
}