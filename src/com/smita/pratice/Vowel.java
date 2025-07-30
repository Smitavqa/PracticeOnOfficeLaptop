package com.smita.pratice;

public class Vowel {

	public static void main(String[] args) {
		
		String string = "Smita";
		char[] ch = string.toCharArray();
		int count = 0;
		for (int a = 0; a < string.length(); a++) {
			if (string.charAt(a) == 'a'|| string.charAt(a) == 'i') {
				count++;
				System.out.println("String contanins vowels "+ string.charAt(a)+ "  At index " + a);
			}

		}

	}

}
