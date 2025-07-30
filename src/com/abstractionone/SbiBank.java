package com.abstractionone;

public class SbiBank extends RbiBank {

	@Override
	public void requiredDocument() {
		System.out.println("I am abstract method");	
	}
	
	public  int requiredDocument1() {
		return 0;
	}
	
	public  String requiredDocument2() {
		return null;
	}
   public char requiredDocument3() {
	return 0;
} 
   public float requiredDocument4() {
	return 0;
}
	public double requiredDocument5() {
		return 0;
	}
	
	public boolean requiredDocument6() {
		return false;
	}
}
