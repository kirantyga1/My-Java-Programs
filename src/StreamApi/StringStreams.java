package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreams {
	public static void main(String[] args) {
		/*
		 * List<Integer> numbers = Arrays.asList(1, 3, 6, 5, 2, 4); numbers.stream()
		 * .filter(l -> l % 2 == 0 && l>=4) .map(l->l+10) .forEach(bn ->
		 * System.out.println(bn));
		 */

		//IntStream.of(1, 2, 3).map(i -> i * 5).forEach(System.out::println);
		//IntStream.range(1, 10).map(j -> j * 5).forEach(System.out::println);
		//IntStream.range(1, 5).map(k -> k * 2).average().ifPresent(k->System.out.println(k));

	}
}
