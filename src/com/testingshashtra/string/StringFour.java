package com.testingshashtra.string;

public class StringFour {
	public static void main(String[] args) {
		String password = "admin@123";
		int count = 0;		
		for (int i = 0; i < password.length(); i++) {	
			char ch = 	password.charAt(i);
			if (ch == 'a' || ch == 'i'|| ch == '0' || ch == 'u'|| ch == 'e') 
			{
				count++;
			}			
		}
			System.out.println("Number of vowels  "+ count);
	}
}
