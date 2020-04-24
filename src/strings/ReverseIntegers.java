package strings;

public class ReverseIntegers {

	public static void main(String[] args) {

		int num=123;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		int num2 = 1234569; // StringBuffer sb=new StringBuffer();
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	}
	

}
