package com.smita.pratice;

public class NonAlphaCount {

	public static void main(String[] args) {
		String s1 = "smita@2024!";
		char[] s2 = s1.toCharArray();
		int nonAlphacount = 0;
		
		for(char c:s2) {
			if(Character.isLetterOrDigit(c));{
				nonAlphacount++;
			}
		}
  System.out.println(nonAlphacount);
	}

}
