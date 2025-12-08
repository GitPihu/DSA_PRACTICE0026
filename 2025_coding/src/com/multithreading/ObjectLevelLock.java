package com.multithreading;

public class ObjectLevelLock {

	int counter = 0;

	public int autoInc() {
		synchronized (this) {
			return counter++;
		}

	}
	public static void main(String args[]) {
		ObjectLevelLock obj = new ObjectLevelLock();
		
		Runnable r1 = () -> {
			for (int i = 0; i < 1000; i++) {
				obj.autoInc();
			}
		};
		Runnable r2 = () -> {
			for (int i = 0; i < 100; i++)
				obj.autoInc();
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		System.out.print(obj.counter);

	}

}
