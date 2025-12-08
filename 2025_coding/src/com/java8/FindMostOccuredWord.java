package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMostOccuredWord {
	 int num=10;
	public  void display() {
		int num=15;
		System.out.print(this.num);
		
	}
	
	
	public static void main(String args[]) {

		String str = "Priyanka hi hi you okay hi yare you good good good good";

		String strArr[] = str.split(" ");

		Map<String, Long> res = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(),
				Collectors.mapping(String::toUpperCase, Collectors.counting())));

		Optional<Map.Entry<String, Long>> fRes = res.entrySet().stream().max(Map.Entry.comparingByValue());

		System.out.println(fRes.get().getKey() + "=" + fRes.get().getValue());

		// find second max

		List<Integer> lst = new ArrayList<Integer>();

		lst.add(500);
		lst.add(300);
		lst.add(400);
		lst.add(700);
		lst.add(700);
		int n = 4;
		Optional<Integer> val = lst.stream().distinct().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();
		System.out.println(val.get());

		// remove vouls from string
		//
		String s = "AuDevai";

		String regex = "[aeiouAEIOU]";
		String res1 = s.replaceAll(regex, "");
		System.out.print(res1);

		// Convert list data in upper case

		List<String> upper = new ArrayList<String>();
		upper.add("Priyanka");
		upper.add("Priyanka");
		upper.add("Priyanka");
		upper.add("Priyanka");
		List<String> uu = upper.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());

		System.out.print(uu);
		// count character of a given statement

		String ch = "Priyanka is it a good time to talk";

		char c[] = ch.toCharArray();

		Map<Character, Long> charStream = IntStream.range(0, c.length).mapToObj(i -> c[i])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.print(charStream);
		
		FindMostOccuredWord o=new FindMostOccuredWord();
		
		//o.display();
		
		System.out.print(o.num);
	}

}
