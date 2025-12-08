package com.coding;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatFromArray {
	public static void main(String args[]) {

		// find common
		int arr1[] = { 12, 3, 4, 5, 6, 12, 5, 6 };
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (lst.contains(arr1[i])) {
				System.out.println(arr1[i]);
			} else {
				lst.add(arr1[i]);
			}
		}

		// System.out.println(lst);

	}
}
