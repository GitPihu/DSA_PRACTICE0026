package com.leetcode.pratcice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstNonRepeatingChar {

	public static void main(String args[]) {
		String str = "aabbc ";
		//String str = "aabbc ";
		

		String arr[] = str.split("");

		Map<String, Long> res = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		int count = IntStream.range(0, str.length()).filter(i -> res.get(String.valueOf(str.charAt(i))) == 1).findFirst().orElse(-1);

		System.out.print(count);
//		String s="Priyanka yadav";
//		String str1[]=s.split(" ");
//		
//		
//		int len=str1.length-1;
//		System.out.print(str1[len].length());

	}

}
