package com.package1;

public class C1 {
   public void instancemethod() {
	   System.out.println("Instance method from package called");
   }
	
	  public static void saticMethod() {
	  System.out.println(" Static method from Package1 called");
	  }
	 
	  public static void main(String[] args) {
		  C1 c1 = new C1();
		  c1.instancemethod();
		  C1.saticMethod();
	  }
}

