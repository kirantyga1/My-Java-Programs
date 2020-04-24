import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesinanArray2 {

	public static void main(String[] args) {

		String sentense = "Hey kiran How are you kiran";

		String strings[] = sentense.split(" ");

		HashMap<String, Integer> resultmap = new HashMap<>();
		for(String string: strings) {
			if(resultmap.containsKey(string)) {
				resultmap.put(string, resultmap.get(string)+1);
			}else {
				resultmap.put(string, 1);
			}
		}
		
		Set<String> resultSet=resultmap.keySet();
		for(String string: resultSet) {
			if(resultmap.get(string)>1) {
				System.out.println(string+ " ="+resultmap.get(string));
			}
		}
		/*
		 * for(Entry<String, Integer> entry: resultmap.entrySet()) {
		 * System.out.println(entry.getKey() +"="+ entry.getValue());
		 * 
		 * }
		 */
	}

}
