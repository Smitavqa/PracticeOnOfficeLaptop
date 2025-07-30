package com.testshashtra.method;



public class MethodOneClasss {

	public static int addTwoNumbers() {
		System.out.println("Addition");
		return 0;
		
	}
	public static void myMethod() {
	    System.out.println("I am Static method");
	   // addTwoNumbers();
	   
	  }
	
	public  int SubTwoNumbers() {
		System.out.println("Subtraction non static method");
		
		return 0;
	
		
	}
	public  void subMethod() {
	    System.out.println("I just got executed! ");
	    SubTwoNumbers();
	  
	  }
	  public static void main(String[] args) {
		// myMethod();
		 MethodOneClasss objClasss = new MethodOneClasss();
		 objClasss.SubTwoNumbers();	
	  }

}
