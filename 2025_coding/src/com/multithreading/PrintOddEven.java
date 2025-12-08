package com.multithreading;

public class PrintOddEven {
	volatile int counter = 1;
	int maxLimit = 20;

	public synchronized void printOdd() {

		while (counter <= maxLimit) {
			while (counter % 2 == 1) {
				try {
					Thread.sleep(200);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System. out.println("odd"+counter);
			counter++;
			notify();
		}

	}

	public synchronized void printEven() {
		while (counter <= maxLimit) {
			while (counter % 2 == 0) {
				try {
					Thread.sleep(200);

					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("even"+counter);
			counter++;
			notify();
		}

	}

	public static void main(String args[]) {

		PrintOddEven obj1 = new PrintOddEven();

		Runnable r1 = () -> {
			obj1.printOdd();

		};
		Runnable r2 = () -> {
			obj1.printEven();

		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
	


