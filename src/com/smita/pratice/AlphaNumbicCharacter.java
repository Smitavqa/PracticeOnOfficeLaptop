package com.smita.pratice;

import java.util.concurrent.CountDownLatch;

public class AlphaNumbicCharacter {

	public static void main(String[] args) {
	
		String s1 = "Testing@2024!";
		char[] ch =  s1.toCharArray();
		int CountDownLatch = 0;
		
		for(char c:ch) {
			if(!Character.isLetter(c)) {
				CountDownLatch++;
				
			}
		}
		System.out.println(CountDownLatch);

	}

}
