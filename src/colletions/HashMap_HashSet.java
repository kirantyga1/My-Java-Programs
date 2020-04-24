package colletions;

import java.util.concurrent.ConcurrentHashMap;

public class HashMap_HashSet extends Thread {
	public static void main(String[] args) throws Exception {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		try {

			if (m.keys() != null) {
				m.put(100, "Geeks");
				m.put(100, "Geeks");
 
				System.out.println(m);
			}
		} catch (Exception e) {
			System.out.println("Null pointer Exception");
 
		}
	}

}
