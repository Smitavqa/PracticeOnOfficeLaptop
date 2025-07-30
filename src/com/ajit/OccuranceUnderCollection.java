package com.ajit;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceUnderCollection {
	public static void main(String[] args) {
		String string = "i am aj ngnareeeeeeeeeeeeeeeeeeeeeee";
		string = string.replaceAll(" ", "");
		char[] c = string.toCharArray();
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (char d : c) {
			if (m.containsKey(d)) { // check repeat char 
				m.put(d, m.get(d)+1);
			} else { 
				m.put(d, 1);
			}
		}
		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			if (e.getValue()==1) {
				System.out.println(e.getKey() +" "+e.getValue());
			}
			
		}
	}
}
