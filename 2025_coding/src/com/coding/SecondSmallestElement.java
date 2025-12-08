package com.coding;

public class SecondSmallestElement {
	public static void main(String args[]) {

		int arr[] = { 4, 6, 8, 9,4 };
		int fs = 543;
		int ss = 768;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < fs) {
				fs = arr[i];
				ss = fs;
			} else if (arr[i] < ss) {
				ss = arr[i];
			}
		}
		System.out.println(ss);

	}

}
