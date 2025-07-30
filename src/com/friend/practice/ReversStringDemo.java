package com.friend.practice;

public class ReversStringDemo {

	public static void main(String[] args) {
		
		String strings = "Smita";
	    
		for(int i= strings.length()-1; i>=0; i--) {
			
			char rev = strings.charAt(i);
			System.out.print (rev);
		}
		
	}

}
