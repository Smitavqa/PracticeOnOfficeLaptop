package com.sujat.practice;

public class SumOfTwoStringWithThirdPR {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		String s3 = "Hello world";
		
		int twoStringCount = s1.length() + s2.length();
		
		
			if(s3.length()==twoStringCount) {
				System.out.println("Its equal");
			} else {
				System.out.println("Its not equal");
			}
			
	}

}
