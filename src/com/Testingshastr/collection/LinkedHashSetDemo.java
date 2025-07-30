package com.Testingshastr.collection;

import java.util.LinkedHashSet;



public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(10);
	 System.out.println(linkedHashSet);
		boolean b = linkedHashSet.add(11);
		  System.out.println("Add method here " + b);
		  System.out.println(linkedHashSet + "After add elements");
			
		LinkedHashSet linkedHashSet2 = new LinkedHashSet<>();
		linkedHashSet2.add(10);
		linkedHashSet2.add(12);
	
				
	  System.out.println(linkedHashSet2);
	  
	  boolean eleEqual = linkedHashSet2.equals(linkedHashSet);
	  System.out.println(eleEqual);
	
		
		

	}

}
