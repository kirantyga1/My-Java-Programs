package strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Please enter any word?");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char[] letters=new char[str.length()];
		for (int i = str.length() - 1; i >= 0; i--) {
			int letterIndex=0;
			letters [letterIndex]=str.charAt(i);
			letterIndex++;
			System.out.print(str.charAt(i));
		}
	}
}
