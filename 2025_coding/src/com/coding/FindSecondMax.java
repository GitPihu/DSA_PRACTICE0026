package com.coding;

public class FindSecondMax {

	public static void main(String args[]) {

		int fmax = 0;
		int smax = 0;

		int arr[] = { 12, 6, 100,100, 50 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {

				int temp = fmax;
				fmax = arr[i];
				smax = temp;

			} else if (arr[i]!=fmax && arr[i] > smax) {
				smax = arr[i];
			}
		}
		System.out.print(smax);

	}

}
