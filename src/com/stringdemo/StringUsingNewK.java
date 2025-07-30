package com.stringdemo;

public class StringUsingNewK {

	public static void main(String[] args) {
		String s = new String("Hello");
		String t = new String("Hello");
		String bString = "Hello";
		
		if(s==t) {
			System.out.println("Equals"); // It is store in heap memory with different addresses  
		} else if(s.equals(t)) {                           // so addresses are getting compares not with a text  
			System.out.println("content same"); // O/P:  Not equal
		} else if(bString.equals(s)) {                           // so addresses are getting compares not with a text  
			System.out.println("content same bString"); // O/P:  Not equal
		}
		
	}

}
