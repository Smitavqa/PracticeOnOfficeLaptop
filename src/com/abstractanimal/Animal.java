package com.abstractanimal;

public abstract class Animal {

	public abstract void animalSound();
	public abstract void m1();
	public abstract void m2();
	 public  abstract void m3();
	
	
	
	private  void sleep(){
		System.out.println("I am Private Method");
	}
	
	public  void sleepOne(){
		System.out.println("I am public Method");
		sleep();
	}
	public static void staticAbstractMethod() {
		System.out.println("I am static Abstract Method");
		
	}
	public final void fianlAbstractMethod() {
		System.out.println("I am final Abstract Method");
		
	}
	
	public  Animal(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
	}

}
