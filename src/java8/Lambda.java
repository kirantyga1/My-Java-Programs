package java8;

import java.util.ArrayList;
import java.util.Iterator;

public class Lambda {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<>();
		tvSeries.add("Breaking Bad");
		tvSeries.add("Prison break");
		tvSeries.add("Game of thrones");
		tvSeries.add("Suits");
		
		
		System.out.println("------Print using Java8 lambda expression:");
		tvSeries.forEach(shows -> {

			System.out.println(shows);
		});

		
		System.out.println("-------Print using Iterator:");
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------Print using For each loop:");
		
		for(String show:tvSeries) {
			System.out.println(show);
		}
	}

}
