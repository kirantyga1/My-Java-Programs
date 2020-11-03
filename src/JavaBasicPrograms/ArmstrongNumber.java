package JavaBasicPrograms;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int counter = 0;
		int result = 0;

		while (number > 0) {
			int remainder = number % 10;
			result = result + (remainder * remainder * remainder);
			counter++;
			number = number / 10;
		}
		System.out.println(result);
	}

}
