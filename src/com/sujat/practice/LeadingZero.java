package com.sujat.practice;


import java.util.ArrayList;


public class LeadingZero {

	public static void main(String[] args) {
		
	int [] input = {2, 3, 4,0,0,3,5,9};
	
	ArrayList<Integer> zeroList = new ArrayList<>();
	ArrayList<Integer> nonzeroList = new ArrayList<>();
	for(int num:input) {
		if(num == 0) {
			zeroList.add(num);
	}else {
		nonzeroList.add(num);
		}
	}
		
	ArrayList <Integer> resultList = new ArrayList<>();
	
	resultList.addAll(nonzeroList);
	resultList.addAll(zeroList); 
	System.out.println(resultList);
	
	}
}
