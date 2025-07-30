package com.testingshashtra.string;

public class StringVowels {

	public static void main(String[] args) {
		int count = 0;
		String goodWordString = " I live Ice cream i am in fredge";
		for (int i = 0; i <= goodWordString.length(); i++) {
			if (goodWordString.charAt(i) == 'i') {
				System.out.println(goodWordString.charAt(i) );
				System.out.println("I am after Capital"+ goodWordString.toUpperCase() );
				count++;
				System.out.println("Numner of I in the given sentance" + count);
				System.out.println("");

			}
		}
	}

}
