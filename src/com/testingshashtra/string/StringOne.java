package com.testingshashtra.string;

public class StringOne {

	public static void main(String[] args) {
		String dString = "Hello";
		String tString=  dString.concat(	"Testing shashtra");
		System.out.println(tString);
		System.out.println(dString);
		
		StringBuffer sBuffer = 	new StringBuffer("Hello");
		sBuffer.append("Testing");
		System.out.println(sBuffer);

	}

}
