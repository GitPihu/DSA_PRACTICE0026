package com.coding;

public class palindrom {
	public static void main(String args[]) {

		String str = "madamu";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equalsIgnoreCase(sb.toString())) {
			System.out.println("String is pelindrom");
		}

	}

}
