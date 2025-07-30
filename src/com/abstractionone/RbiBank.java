package com.abstractionone;

 public abstract class RbiBank {
    
	// final int x;  Final variable must have value
	 public void sleep() {
		 System.out.println("I am concrete method");
	 }
	 
	public abstract void requiredDocument();
	public abstract int requiredDocument1();
	public abstract String requiredDocument2();
	public abstract char requiredDocument3();
	public abstract float requiredDocument4();
	public abstract double requiredDocument5();
	public abstract boolean requiredDocument6();
	
	/*
	 * public RbiBank() { System.out.println("I am Construct method"); }
	 */ 
	public static void main(String[] args) {
		
	}

}
