package strings;

public class StringManipulation {

	public static void main(String[] args) {

		String str1 = "Hello kiran";
		String str2 = "Hello kiran";

		System.out.println(str1.length());
		System.out.println(str1.charAt(8));
		
		//First occurrence of 'r'
		System.out.println(str1.indexOf('r'));

		//Second occurrence of 'r'
		System.out.println(str1.indexOf('r', str1.indexOf('r') + 1));
		
		//Third occurrence of 'r'
		System.out.println(str1.indexOf('r', str1.indexOf('r',str1.indexOf('r')+1)+1));
		
		System.out.println(str1.indexOf("kiran"));
		
		
		//String Comparison
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Substring
		System.out.println(str1.substring(0,11));
		
		//String trim
		String s="  Hi how are you   ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String date="05-13-1990";
		System.out.println(date.replace("-", "/"));
		
		
		//Split
		String test="Hello_world_test_kiran";
		
		String strval[]=test.split("_");
		
		for(int i=0;i<strval.length;i++) {
		System.out.println(strval[i]);
		

		String s3="Hi";
		String s4="Hello";
		System.out.println(s3.concat(s4));
		}
		
	}

}
