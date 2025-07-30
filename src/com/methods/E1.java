package com.methods;

public class E1 {

	
	void instanceMethod() {
		System.out.println("Instance Method");
	}
	
	static void staticMethod() {
		System.out.println("static Method");
	}
	public static void main(String[] args) {
		
     E1 e = new E1();
     e.instanceMethod();
		 
	}

}
