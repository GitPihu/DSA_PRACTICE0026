package com.neet.code.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicate {
	public boolean hasDuplicate(int[] nums) {

		// using set
		boolean hasDuplicate;
		Set<Integer> st = new HashSet<Integer>();
		hasDuplicate = Arrays.stream(nums).anyMatch(n -> !st.add(n));

		if (hasDuplicate) {
			return hasDuplicate;

		}
		return hasDuplicate;
	}

	public static void main(String args[]) {
		ContainsDuplicate obj = new ContainsDuplicate();
		int arr[] = { };
		boolean b=obj.hasDuplicate(null);
		System.out.print(b);
	}
}
