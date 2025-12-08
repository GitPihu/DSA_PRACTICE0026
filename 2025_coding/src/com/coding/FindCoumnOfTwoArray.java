package com.coding;

import java.util.ArrayList;
import java.util.List;

public class FindCoumnOfTwoArray {
	public static void main(String args[]) {
		int arr1[] = { 12, 3, 4, 5, 6, 12, 5 ,0};
		int arr2[] = { 13, 66, 5, 6, 12, 75,7 };

		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j] && !lst.contains(arr1[i])) {

					lst.add(arr1[i]);
				}

			}

		}
		System.out.println(lst);

	}

}
