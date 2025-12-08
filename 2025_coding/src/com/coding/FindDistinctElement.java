package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDistinctElement {
	public static void main(String args[]) {

		// find unique
		int arr1[] = { 12, 3, 4, 5, 6, 12, 5, 6 };
		/**
		 * First approach convert list to set
		 * 
		 */
		Set<Integer> st = new HashSet<>(Arrays.asList(12, 3, 4, 5, 6, 12, 5, 6));
		System.out.println(st);

		/**
		 * using normal array
		 */
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (!lst.contains(arr1[i])) {
				lst.add(arr1[i]);

			}
		}

		System.out.println(lst);

	}
}
