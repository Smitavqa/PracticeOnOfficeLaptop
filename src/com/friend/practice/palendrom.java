package com.friend.practice;

public class palendrom {

	public static void main(String[] args) {
	
		String string = "NAN";
		String rev = " ";
		
		for(int i=string.length()-1;i>=0;i--) {
			
			  rev = rev + string.charAt(i);
		}
			if(string.equals(rev)) {
				System.out.println("Palindrom  "+ rev);
			}
			else {
				System.out.println("not Palindrom "+ rev);
			}
		}



}
