package com.java8;

public class CustomeInterafce {
	public static void main(String args[]) {

		Sqr s = (a) -> a * a;
		int res = s.sqr(2);
		System.out.print(res);

	}

}

@FunctionalInterface
interface Sqr {

	public int sqr(int a);
	
	default void abc() {
		
	}

}

@FunctionalInterface
interface Sqr1 {

	public int sqr(int a);
	
	default void abc() {
		
	}

}