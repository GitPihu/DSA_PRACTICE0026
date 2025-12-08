package com.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

public class SleepMethodDemo {

	public static void main(String args[]) throws InterruptedException {

		// for (int i = 0; i < 20; i++) {
//
//			try {
//				Thread.sleep(1000);
//
//				System.out.println(i + " ");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}

		Runnable r1 = () -> {

			for (int i = 0; i < 20; i++) {

				try {
					Thread.sleep(1000);

					System.out.println(i + " ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};

		Thread t1 = new Thread(r1, "Priyanka");
		t1.start();
		t1.join();
		for (int j = 0; j < 20; j++) {
			Thread.sleep(1000);
			System.out.println(j);
		}
		System.out.println("hello its comeplted!!!!");

		ConcurrentHashMap<String, String> sb = new ConcurrentHashMap<String, String>();

		Semaphore sm=new Semaphore(2);

	}

}
