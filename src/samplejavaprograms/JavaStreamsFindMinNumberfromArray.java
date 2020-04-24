package samplejavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class JavaStreamsFindMinNumberfromArray {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList( 1, 5, 3, 7, 9, 2, 0,1 ,2 ,0 );
		
		//To get different statistics from an Array
		//IntSummaryStatistics statics = IntStream.of(numbers).summaryStatistics();
		//System.out.println(statics);
		
		//To find distinct numbers in anArray
		//IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
		
		//List<Integer> evenNumbers=numbers.stream().filter(i ->i)

	}

}
