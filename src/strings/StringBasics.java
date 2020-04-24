package strings;

public class StringBasics {

	public static void main(String[] args) {

		String str1 = "kiran";

		char ch1[] = new char[str1.length()];

		for (int i = 0; i < str1.length(); i++) {
			ch1[i] = str1.charAt(i);
		}
		for (char c : ch1) {
			System.out.println(c);
		}
	}

}
