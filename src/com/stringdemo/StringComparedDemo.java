package com.stringdemo;

public class StringComparedDemo {

	public static void main(String[] args) {
		String s = "Hello";
		String t = "He";
		String p = t+"llo";
		
		if(s==p) {
			System.out.println(" Equal");
		}else {
			System.out.println("Not equal"); // O/P: Not equal bcoz Value in s and value in P
			                                 // Stored in the different memory
		}

	}

}
