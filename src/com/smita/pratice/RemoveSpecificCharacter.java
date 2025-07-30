package com.smita.pratice;

public class RemoveSpecificCharacter {

	public static void main(String[] args) {
	String s1 = "TestAutommatioooon";
	char[] s2 =s1.toCharArray();
	StringBuffer resultBuffer = new StringBuffer();
	
	for(char c:s2) {
		if(c!= 'o') {
			resultBuffer.append(c);
		}
	}
	System.out.println(resultBuffer);

	}

}
