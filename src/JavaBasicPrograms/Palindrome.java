package JavaBasicPrograms;

public class Palindrome {

	public static void main(String[] args) {

		int num = 1234;
		// int length = String.valueOf(num).length();
		int result = 0;
		int count = 0;
		// for (int i = length-1; i >=0 ; i--) {
		while (num > 0) {
			result = result * 10 + num % 10;
			num = num / 10;
			count++;
		}
		System.out.println(result);

		String str = "Kiran";
		char[] letters = new char[str.length()];
		int letterIndex = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			letters[letterIndex] = str.charAt(i);
			letterIndex++;
			System.out.print(str.charAt(i));
		}
		
	}

}
