package com.sujat.practice;


public class NonAlphnumberiCount {

	public static void main(String[] args) {
		String s1 = "Test@2024!";
		char[] s2= s1.toCharArray();
		int nonAlpha = 0;
		for(char c:s2) {
			if(Character.isLetterOrDigit(c)) {
				nonAlpha++;
			}
		}
     System.out.println(nonAlpha);
	}

}
