package com.coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestString {
	public static void main(String args[]) {

		String s = "abbac";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		char[] ch = s.toCharArray();
		int lsusLen = 0;
		String LongestS = "";

		for (int i = 0; i < ch.length; i++) {
			char key = ch[i];
			if (!mp.containsKey(key)) {
				mp.put(key, i);
			} else {
				i = mp.get(key);
				mp.clear();
			}
			if (mp.size() > lsusLen) {
				lsusLen=mp.size();
				LongestS = mp.keySet().toString();
			}

		}
		System.out.println(LongestS);

	}

}
