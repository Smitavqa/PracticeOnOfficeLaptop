package com.stringdemo;

public class StringOne {

	public static void main(String[] args) {
		String string = "Hello";
		String string2 = "Hello";
		if(string==string2) {
			
			System.out.println("It is equal");
		}else {
			System.out.println("It is not equal");
		}
		string.concat("Smita");
		System.out.println(string);
		
		
		String t = new String("hello bt using new keyword");
		System.out.println(t);
	}

}
