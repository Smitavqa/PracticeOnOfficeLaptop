package com.ajit;


public class AddtionOfNumber {
	
	public static void main(String[] args) {
	String s = "I got 789 marks";
	String opString = "";
	String opString2 = "";
	char[] c= s.toCharArray();
	for (int i=0;i<c.length; i++) {
    if(Character.isDigit(c[i])) {
    	opString2 = opString2 + c[i];
    }else {
    opString = opString + c[i];
    } 
 
    	
	}
	System.out.println("my no :" + opString2);
	System.out.println("my string is :" + opString);  	
}
}