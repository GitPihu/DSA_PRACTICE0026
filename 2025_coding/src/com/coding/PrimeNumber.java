package com.coding;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		for (int j = 2; j <= n/2; j++) {//n/2 it will loop halh only bease greater t

			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		for (int i = 1; i < 100; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.println(" prime==>" + i);

			}

		}

	}

}
