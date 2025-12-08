package stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainDemo {
	public static void main(String args[]) {

		// Find max word

		String s = "I am priyanka yadav bhavanadaman";

		String res = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();

		System.out.print(res);

		// remove duplicate from string

		String s1 = "I am priyanka yadav bhavanadaman priyanka am";

		List<String> res1 = Arrays.stream(s1.split(" ")).distinct().collect(Collectors.toList());

		System.out.print(res1);

		// find second highest

		String s3 = "I am priyankaa yadav bhavanadaman priyanka am";
		Optional<String> sss = Arrays.stream(s3.split(" ")).sorted(Comparator.comparing(String::length).reversed())
				.skip(1).findFirst();

		System.out.print(sss);

		// find word count of a given stmt

		String wc = "I am priyanka from silvassa , I live in silvassa daman silvassa";
		Map<String, Long> sd = Arrays.stream(wc.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.print(sd);

		// find char count of a given word
		String s111 = "Programming priyanka";

		Map<Character, Long> countMap = s111.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println("Character Occurrences:");

		countMap.forEach((k, v) -> System.out.println(k + " : " + v));
		
		
		
		/**
		 * Functional interface demo
		 */

		Add a1 = (a,b) -> {
			return a+b;

		};
		int result = a1.add(10, 20);
		System.out.print(result);

	}

}

interface Add {
	public int add(int a, int b);
}
