package com.neet.code.io;

import java.util.Arrays;
import java.util.List;

public class StringAnagarm {
	public boolean isAnagram(String s, String t) {
		boolean flag = false;
		if ((s == null || s.isEmpty()) || (t == null || t.isEmpty()))
			return false;
		if (s.length() != t.length())
			return false;

		String str1[] = s.toLowerCase().split("");

		String str2[] = t.toLowerCase().split("");
		List<String> str = Arrays.asList(str2);

		for (String s1 : str1) {
			if (str.contains(s1)) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return flag;

	}

	public static void main(String args[]) {

		StringAnagarm obj = new StringAnagarm();
		boolean b = obj.isAnagram("Priyanka", "aknayipr");

		System.out.println(b);

	}

}
