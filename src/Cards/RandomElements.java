package Cards;

import java.util.LinkedList;
import java.util.*;

public class RandomElements {
	public static void main(String[] args) {

		List<String> teamList = new LinkedList<>();
		teamList.add("2");
		teamList.add("3");
		teamList.add("4");
		teamList.add("5");
		teamList.add("6");
		teamList.add("7");
		teamList.add("8");
		teamList.add("9");
		teamList.add("10");
		teamList.add("J");
		teamList.add("Q");
		teamList.add("K");
		teamList.add("A");
		Collections.shuffle(teamList);

		String[] chosen3 = new String[8];
		for (int i = 0; i < chosen3.length && teamList.size() > 0; i++) {
			chosen3[i] = teamList.remove(1);
		}
		System.out.println(teamList );
	}
}
