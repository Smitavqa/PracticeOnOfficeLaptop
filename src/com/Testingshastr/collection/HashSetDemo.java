package com.Testingshastr.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println("Hashcod   " + s.hashCode());
		HashSet<Object> hSet = new HashSet<>();
		hSet.add(10);
		hSet.add(21);
		boolean b = hSet.add(21);
		hSet.add(45);
		hSet.add(97);
		hSet.add(38);
		hSet.add(47);
		hSet.add(null);
		hSet.add(90);
		
		hSet.add("Hello");
		System.out.println(b);
		System.out.println(hSet);
	}

}
