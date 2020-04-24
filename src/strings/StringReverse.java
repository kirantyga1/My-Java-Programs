package strings;

public class StringReverse {

	public static void main(String[] args) {

		
		String str="kiran";
		String rev="";
		for(int i=str.length()-1; i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
	}

	/*
	 * public static String reverse(String s) { int letterIndex = 0; char[] letters
	 * = new char[s.length()]; for (int i = s.length() - 1; i >= 0; i--) {
	 * letters[letterIndex] = s.charAt(i); letterIndex++; } String reverse = ""; for
	 * (int i = 0; i < s.length(); i++) { reverse = reverse + letters[i]; } return
	 * reverse; }
	 */
}
