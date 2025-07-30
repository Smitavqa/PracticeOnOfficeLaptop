package com.testingshashtra.string;

public class TrimString {

	public static void main(String[] args) {
	
		String passString = "  Hellow Java      ";
		
		System.out.println("String length is before user trim method   " + passString.length() + "  and Out put is" +passString);
       
		passString = passString.trim();
		
		System.out.println("String length is After user trim method   " +  passString.length() + "  and Out put is  " +passString);

	
	
	}

}
