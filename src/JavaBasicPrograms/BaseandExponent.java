package JavaBasicPrograms;
import java.util.Scanner;

public class BaseandExponent {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter base value:");
		int base=scn.nextInt();
		
		System.out.println("Enter base exponent:");
		int exponent=scn.nextInt();
		
		int result=base*base*base;
		System.out.println(result);
	}
}
