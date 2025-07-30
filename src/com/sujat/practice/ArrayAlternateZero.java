package com.sujat.practice;

import java.util.ArrayList;
public class ArrayAlternateZero {

	public static void main(String[] args) {
	
		int [] input=  {1,0,0,0,1,2,3,4};
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
			
		for(int Value:input) {
			if(Value != 0) {
				resultList.add(Value);
				resultList.add(0);
				
			} 
		}
		
		System.out.print(resultList);
	}

}
