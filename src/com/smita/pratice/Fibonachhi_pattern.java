package com.smita.pratice;

public class Fibonachhi_pattern {

	public static void main(String[] args) {
		int x =0, y= 1, temp;
		for(int line =1; line< 4; line++)
		{  
			for(int sp=0;sp< 4; sp++) {
				
			System.out.println("  ");
				
			for(int ast =1; ast< line;ast++) {
				System.out.print(x+ " ");
				temp = x+y;
				x=y;
				y=temp;
		     	}
			}
		}System.out.println(" ");

	}

}
