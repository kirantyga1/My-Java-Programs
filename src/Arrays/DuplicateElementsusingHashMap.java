package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsusingHashMap {

	public static void main(String[] args) {

		String names[] = { "Java", "C", "Ruby", "Java", "Python","C"};

		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		Set<java.util.Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element is :" + entry.getKey());
			}
		}
	}

}
