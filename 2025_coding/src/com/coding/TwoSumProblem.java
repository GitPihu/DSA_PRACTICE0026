package com.coding;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String arsg[]) {
		int arr[] = {-10, 4, 5, 6, 2, 10 };
		int t = 10;

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int result = t - arr[i];

			if (mp.containsKey(result)) {

				System.out.print(mp.get(result) + "" + i);

			}

			mp.put(arr[i], i);

		}

	}

}
