
public class Prime {

	public static void main(String[] args) {
		
		int n=33; int flag =0;
		if(n==0 || n==1) {
			System.out.println(n+" Is not a prime number");
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println(n+ " Is not a prime number");
					flag=1;
					break;
				}
			}
		}if(flag==0) {
			System.out.println(n+ "  Is a prime number");
		}
		

	}
}