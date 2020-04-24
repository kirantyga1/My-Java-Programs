package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		System.out.println("How many stars would you like to enter?");
		Scanner scn = new Scanner(System.in);
		int numofStarts = scn.nextInt();
		for (int i = 1; i <= numofStarts; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = numofStarts-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
