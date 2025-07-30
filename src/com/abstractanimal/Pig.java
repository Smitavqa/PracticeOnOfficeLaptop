package com.abstractanimal;

public  class Pig extends Animal{
	public Pig(int a, int b) { // we can use constructor in the abstraction
		super(a, b);           // we can use constructor in the abstraction
		
	}

	public void m1() {
		System.out.println("I m abstract M1");
	}
	
	public void m2() {
		System.out.println("I m abstract M2");
	}
	
	public void m3() {
		System.out.println("I m abstract M3");
	}
	
	// public abstract void m4();  abstract method must be declare in abstract class
	
	
	public void animalSound() {
		System.out.println("Pig says weee weee");
	}

	public static void main(String[] args) {
		Pig pig = new Pig(2, 4);// we can use constructor in the abstraction
		pig.animalSound();
		pig.m1();
		pig.m2();
		pig.m3();
	//	pig.sleep();
		Animal.staticAbstractMethod();
		pig.fianlAbstractMethod();
		pig.sleepOne();
		// pig.sleep(); // private method can not call
	
	}
}

