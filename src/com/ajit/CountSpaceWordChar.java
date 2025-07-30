package com.ajit;

public class CountSpaceWordChar {
	public static void main(String[] args) {
	       // System.out.println("Try programiz.pro");
	       String str = "H java hi cuse";
	       
	       int wordCount =0, spaceCount=0, charCount=0;
	       
	       for( int i = 0; i<str.length(); i++){
	           char ch = str.charAt(i);
	           if(ch != ' '){
	               charCount++;
	           }else{
	               spaceCount++;
	           }
	       }
	       String[] word = str.trim().split("\\s+");
	       wordCount = word.length;
	        System.out.println("wordCount    "+ wordCount  + "   spaceCount    " + spaceCount+ "   charCount     " +charCount);
	    }
	
}
