package com.testingshashtra.string;

public class StringLenghtCount {

	public static void main(String[] args) {
		String Password = "I you";
		if (Password.length() >= 8 && Password.length() <= 13) {
			System.out.println("It is valid password  " + Password.length());
		} else {
			System.out.println("Invalid password");
		}

	}

}
