package strings;

public class RemoveJunkFromString {

	public static void main(String[] args) {

		String s="你好 kiRan1217";
		s=s.replaceAll("[^A-Z]", "");
		System.out.println(s);
		
		
		String s1="你好 Kiran1217@gmail.      com   ";
		s1=s1.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
	} 

}
