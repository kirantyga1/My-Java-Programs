package JavaBasicPrograms;
import java.util.Scanner;

public class ColumnRowpattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int rows=scn.nextInt();
		
		System.out.println("Enter Columns:");
		int columns=scn.nextInt();
		
		if(rows ==0 ||columns==0) {
			System.out.println("Rows or colums musto not be null");
		}else {
			for(int i=1;i<=rows;i++) {
				for(int j=1;j<=columns;j++) {
					System.out.print("B");
				}
				System.out.println();
			}
		}
	}
}
