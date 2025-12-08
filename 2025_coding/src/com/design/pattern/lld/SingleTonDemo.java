package com.design.pattern.lld;

public class SingleTonDemo {

	private static SingleTonDemo obj = null;

	private SingleTonDemo() {

	}

	public static SingleTonDemo getInstance() {
		if (obj == null) {
			return obj = new SingleTonDemo();
		}
		return obj;
	}

	public void display() {
		System.out.println("hello");
	}

	public static void main(String args[]) {

		SingleTonDemo obj = SingleTonDemo.getInstance();
		System.out.print(obj.hashCode());
		obj.display();

	}

}
