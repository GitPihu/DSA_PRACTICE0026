package com.neet.code.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringAnagarm {
	public boolean isAnagram(String s, String t) {
		
		// using hash map
		boolean flag = false;
		if ((s == null || s.isEmpty()) || (t == null || t.isEmpty()))
			return false;
		if (s.length() != t.length())
			return false;

		char str1[] = s.toCharArray();
		char str2[] = t.toCharArray();

		

		HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mp2 = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length; i++) {

			mp1.put(str1[i], mp1.getOrDefault(s.charAt(i), 0) + 1);
			mp2.put(str2[i], mp2.getOrDefault(t.charAt(i), 0) + 1);

		}
		System.out.print(mp1);
		System.out.print(mp2);

		if (mp1.equals(mp2)) {
			return true;
		}

		return false;

	}

	public static void main(String args[]) {

		StringAnagarm obj = new StringAnagarm();
		// boolean b = obj.isAnagram("bbcc", "ccbc"); contains not work in this case
		boolean b = obj.isAnagram("bbcc", "ccbc");

		System.out.println(b);

	}

}
