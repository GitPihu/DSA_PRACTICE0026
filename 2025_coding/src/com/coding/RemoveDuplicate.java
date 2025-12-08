package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static List<String> removeDuplicate(String word, List<String> lst) {

		Map<String, Long> result = Arrays.stream(word.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		StringBuffer ab = new StringBuffer();

		char ch[] = word.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (!lst.contains(ch[i])) {
				ab.append(ch[i]);

				// lst.add(ch[i]+"");
			}

		}

		lst.add(ab.toString());

		return lst;

	}

	public static void main(String[] args) {

		String s = "Priyanka";

//		String arr[] = s.split(" ");
//		List<String> lst = new ArrayList<String>();
//		List<String> result = new ArrayList<String>();
//		for (int i = 0; i < arr.length; i++) {
//			result = RemoveDuplicate.removeDuplicate(arr[i],lst);
//		}
		Map<String, Long> result = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("List after remove duplicate " + result);

		String str = "priyanka";
		String str1 = str.chars().distinct().mapToObj(m -> String.valueOf((char) m)).collect(Collectors.joining());

		System.out.print(str1);

		int arr[] = { 12, 3, 4,4, 6, 7, 1,126 };

		List<Integer> lst1 = new ArrayList<Integer>();

		int count = 1;

		for (int i = 0; i < arr.length; i++) {

			if (!lst1.contains(arr[i])) {
				lst1.add(arr[i]);
			} else {
				count++;
			}

		}
		if (count == 2) {
			System.out.print(true);
		} else {
			System.out.print(false);

		}

	}

}
