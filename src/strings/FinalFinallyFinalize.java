package strings;

public class FinalFinallyFinalize {

	public static void main(String[] args) {
test();
	}

	public static void test() {
		int i = 10;
		try {

			int k = i / 0;
			System.out.println("try block executed");
		} catch (ArithmeticException e) {
			System.out.println("Catch block executed");
		} finally {
			System.out.println("Finally block executed");
		}
	}

}
