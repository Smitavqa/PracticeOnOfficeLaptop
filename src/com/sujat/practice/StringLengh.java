package com.sujat.practice;

public class StringLengh {

	public static void main(String[] args) {
	
		String str = "I am Smita here with Ajet logic";
		String[]sp=str.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			if(i%2!=0) {
				System.out.println(sp[i]);
		}
		
			
		}
		
	}

}
