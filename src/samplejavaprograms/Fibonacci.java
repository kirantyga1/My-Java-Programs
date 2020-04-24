package samplejavaprograms;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {

	public static List<Integer> getFibonacci(int series) {
		return Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series).map(n -> n[0])
				.collect(toList());
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number to know Fibonacci:");
		Integer fibonacci=scn.nextInt();
		List<Integer> fibonacci1 = getFibonacci(fibonacci);
		fibonacci1.forEach(x -> System.out.println(x));

	}

}
