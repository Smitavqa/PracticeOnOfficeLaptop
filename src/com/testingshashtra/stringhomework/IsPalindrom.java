package com.testingshashtra.stringhomework;

public class IsPalindrom {

	public static void main(String[] args) {
		String pal = "LOL";
		
		for(int i=0;i<=pal.length(); i++) {
			
		for(int j= pal.length()-1; j<=0; j++) {
			if(pal.charAt(j)== pal.charAt(i)) {
				System.out.println(" it is palindrom");
			}else {
				System.out.println(" it is NOT palindrom");
			}
				
		}
			
		}
	}

}
