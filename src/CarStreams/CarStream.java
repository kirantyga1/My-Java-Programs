package CarStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarStream {

	public static void main(String[] args) {

		Map<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(11, "kiran");
		hMap.put(22, "sam");
		hMap.put(33, "ramesh");
		hMap.put(44, "ramesh");
		hMap.put(55, "ramesh");

		Map<Integer, String> result = hMap.entrySet()
			.stream()
			.filter(map->map.getKey().intValue()<=33)
			.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		
		System.out.println(result);


		Optional<String> o = hMap.entrySet()
                .stream()
                .filter( e -> e.getKey() == 11)
                .map(Map.Entry::getValue)
                .findAny();
		
		System.out.println(o);
		
		
		
		Double result2 = hMap.entrySet()
				.stream()
				.filter(map->map.getKey().intValue()<=33)
			.collect(Collectors.averagingInt(c->c.getKey()));
		
		System.out.println(result2);
		
		/*
		 * Arrays.asList(new Car("Taurus", "Ford", 1500), new Car("Camrey", "Toyota",
		 * 2000), new Car("ES-350", "Lexus", 5000), new Car("Malibu", "Chevrolet",
		 * 3000), new Car("Shellby", "Ford", 6000));
		 * 
		 * carList.stream().filter(Car -> Car.price < 6000 && Car.price >
		 * 1500).forEach(Car -> System.out.println(Car));
		 */

	}

}
