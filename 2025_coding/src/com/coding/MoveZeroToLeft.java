package com.coding;

import java.util.Arrays;

public class MoveZeroToLeft {
	public static void main(String args[]) {

		int arr[] = { 0, 2, 4, 0, 100, 7, 0, 200, 0 };
		int l = arr.length;

		int j = l - 1;
		for (int i = l - 1; i > 0; i--) {

			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
			if (arr[j] != 0) {
				j -= 1;
			}
			// Below code for move zero to right
//			int j = 0;
//			for (int  i = 0; i < arr.length; i++) {
//				
//				if (arr[i] != 0 && arr[j] == 0) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//				if (arr[j] != 0) {
//					j += 1;
//				}

		}
		System.out.print(Arrays.toString(arr));

	}
}
