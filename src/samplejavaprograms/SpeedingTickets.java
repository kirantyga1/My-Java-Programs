package samplejavaprograms;

import java.util.Scanner;

public class SpeedingTickets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Speed :");
		int speedLimit=scn.nextInt();
		
		if(speedLimit<=90) {
			System.out.println("$0 No fine is required.");
		}else if(speedLimit >90 && speedLimit <=100) {
			System.out.println("Fine is $300 plus a warning.");
		}else if(speedLimit >110) {
			System.out.println("Fine is $500 plus having the license removed.");
		}
	}
}
