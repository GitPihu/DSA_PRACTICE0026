package com.neet.code.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {

	public List<List<String>> groupAnagrams(String[] strs) {

		// brute force

		List<String> lst1 = new ArrayList<String>();
		List<List<String>> lst2 = new ArrayList<List<String>>();

		if (strs == null || strs.length == 0)
			return lst2;

		for (int i = 0; i < strs.length; i++) {
			lst1 = new ArrayList<String>();

			String dsaf = strs[i];
			boolean b = lst2.stream().anyMatch(l -> l.contains(dsaf));
			if (b)
				continue;

			lst1.add(strs[i]);
			char[] d1 = strs[i].toCharArray();
			Arrays.sort(d1);

			String el = Arrays.toString(d1);

			for (int j = i + 1; j < strs.length; j++) {

				char[] d2 = strs[j].toCharArray();
				Arrays.sort(d2);

				String e2 = Arrays.toString(d2);

				if (el.equalsIgnoreCase(e2)) {
					lst1.add(strs[j]);
				}

			}
			lst2.add(lst1);
		}

		return lst2;

	}

	public static void main(String args[]) {

		GroupAnagram obj = new GroupAnagram();
		List<List<String>> res = obj.groupAnagrams(new String[0]);

		System.out.print(res);

	}

}
