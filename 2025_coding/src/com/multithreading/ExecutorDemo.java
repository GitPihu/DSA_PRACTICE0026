package com.multithreading;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

	public static int printNumber(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result*i;

		}
		return result;
	}

	public static void main(String args[]) {
		ExecutorService ex = Executors.newFixedThreadPool(03);

		Future<Integer> ab = ex.submit(() -> printNumber(5));
		try {
			int result = ab.get();
			System.out.println(result);

		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.shutdown();
	}

}
