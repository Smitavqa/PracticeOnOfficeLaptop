package com.testingshashtra.string;

public class EqualsString {
 
	public void check() {
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		/*if(s1==s2) {
			System.out.println("Same");
		}*/ 
		
			
		if(s1.equals(s2)) {
			System.out.println("Same");
		}
		
			else {
				System.out.println("different");
			}
	}
	
	
	
	public static void main(String[] args) {
		EqualsString eString = new EqualsString();
		eString.check();
				
		}
	
}