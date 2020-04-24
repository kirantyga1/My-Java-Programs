package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsusingHahSet {

	public static void main(String[] args) {

		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java", "Ruby","Java" };
		
		Set<String> store=new HashSet<String>();
		
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println("Duplicae Element is:" + name);
			}
		}
		
	}

}
