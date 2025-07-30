package com.program.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		String inputString = "abcabcabc";
		Map<Character,List<Integer>> indexMap = new HashMap<>();
		
		indexMap.put('a', new ArrayList<>());
		indexMap.put('b', new ArrayList<>());
		indexMap.put('c', new ArrayList<>());
		
		for(int i=0; i < inputString.length(); i++ ) {
			char currentChar = inputString.charAt(i);
			
			if(indexMap.containsKey(currentChar)) {
				indexMap.get(currentChar).add(i);
				
			}
		} 
		for(Map.Entry<Character, List<Integer>> entry : indexMap.entrySet()) {
		char key = entry.getKey();	
		List<Integer> indices = entry.getValue();
		System.out.println(key + " = " + indices.toString().replaceAll("[\\[\\],]", ""));

	}

}

}
