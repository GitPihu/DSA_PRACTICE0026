package com.leetcode.pratcice;

import java.util.Arrays;
import java.util.List;

public class FindLongCommonOccurance {

	public String longestCommonPrefix(String[] strs) {

		if (strs == null)
			return "";
		Arrays.sort(strs);
		StringBuffer sb = new StringBuffer();
		String[] f = strs[0].split("");
		String[] ls = strs[strs.length - 1].split("");

		for (int i = 0; i < f.length; i++) {

			if (!f[i].equals(ls[i]))
				break;
			sb.append(f[i]);
		}

		return sb.toString();
	}

	public boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer();
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		if (s.isEmpty())
			return true;
		if (s.equalsIgnoreCase(sb.append(s).reverse().toString())) {
			return true;
		}
		return false;
	}

	public int searchInsert(int[] nums, int target) {
		
		List<int[]> lst=Arrays.asList(nums);
		

		return 0;

	}

	public static void main(String args[]) {

		FindLongCommonOccurance obj = new FindLongCommonOccurance();
		String[] strs = { "flower", "flow", "flight" };

		String res = obj.longestCommonPrefix(strs);
		System.out.print(res);

		boolean res1 = obj.isPalindrome(" ");
		System.out.print(res1);

	}

}
