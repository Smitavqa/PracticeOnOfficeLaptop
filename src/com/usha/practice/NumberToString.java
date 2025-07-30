package com.usha.practice;

import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a  number");
		int number = scanner.nextInt();
		
		String numberString = Integer.toString(number);
		
		String[] words = {"zero","One", "Two", "Three", "four", "five", "six", "seven", "eight", "Nine", "ten"};
	
		for(int i=0; i<numberString.length(); i++) {
             char digitChar = numberString.charAt(i);
             int digit = Character.getNumericValue(digitChar);
             System.out.print(words[digit] + 	" ");
		}

	}

}
