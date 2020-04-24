package StreamApi;

import java.util.Arrays;
import java.util.List;

public class JavaStreams {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		for(int i:numbers) {
			if(i%2==0) {
				
				System.out.println("even number:" +i );
			}else {
				System.out.println("Odd number:" +i );
			}
		}
	}
}
