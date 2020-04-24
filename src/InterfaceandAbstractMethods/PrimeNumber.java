package InterfaceandAbstractMethods;

public class PrimeNumber {

	public static boolean isprime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isprime(11));

	}
	public void getPrimenumber(int num) {
		for(int i=2;i<=num;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
}
