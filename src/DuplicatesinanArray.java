import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DuplicatesinanArray {

	public static void main(String[] args) {

		/*
		 * String names[]= {"Kiran","Smith","Kiran","Dhoni","Dhoni"};
		 * HashSet<String>resultset=new HashSet<>(); for(String name: names) {
		 * if(resultset.add(name)==false) { System.out.println(name); } }
		 */

		/*
		 * List<String> strings = new ArrayList<String>(); strings.add("Kiran");
		 * strings.add("Smith"); strings.add("Kiran"); strings.add("Dhoni ");
		 */
		
		
		String sentense= "Hello there my name is kiran kumar kiran is having 4 years of experience java is using by many in the world these days";
		
		String strings[]=sentense.split(" ");

		Map<String, Integer> resultMap = new HashMap<String, Integer>();

		for (String str : strings) {
		    if (resultMap.containsKey(str)) {
		    	resultMap.put(str, resultMap.get(str) + 1);
		    } else {
		    	resultMap.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
