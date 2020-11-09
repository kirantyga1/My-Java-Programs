package JavaBasicPrograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter first number:"); Scanner scn = new
		 * Scanner(System.in); int n1 = scn.nextInt();
		 * 
		 * System.out.println("Enter second number:"); int n2 = scn.nextInt();
		 * 
		 * int n3 = n1 + n2; System.out.println(n3);
		 * 
		 * Random rnd = new Random(); int x = rnd.nextInt(5); System.out.println(x);
		 */

	Test test1=new Test("kiran");
	Test test2=new Test("kiran");
	boolean val=(test1.equals(test2));
	System.out.println(val);
 
		
		/*
		 * String str1="kiran"; String str2="kiran"; boolean
		 * stringvalue=str1.equals(str2); System.out.println(stringvalue);
		 */
	}

}
