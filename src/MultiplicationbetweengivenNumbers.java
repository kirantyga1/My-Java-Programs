import java.util.Scanner;

public class MultiplicationbetweengivenNumbers {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Sirst number:");
		int a=scn.nextInt();
		
		System.out.println("Enter Second number:");
		int b=scn.nextInt();
		
		int sum=0; int mul=1;
		if(a<b) {
			for(int i=a+1;i<b;i++) {
				sum=sum+i;
				mul=mul*i;
			}
		}else {
			System.out.println("Please enter one small number and one bignumber");
		}
		System.out.println("Sum is:"+sum+"mul is:"+mul);
	}

}
