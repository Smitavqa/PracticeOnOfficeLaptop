package com.stringdemo;

public class DefaultContructorDemo {
	
	String carNameString;
	int modelNo;

	public DefaultContructorDemo() {
		carNameString= "Alto";
		modelNo = 2024;
		
		
	}
	
	
			

	public static void main(String[] args) {
		DefaultContructorDemo contructorDemo = new DefaultContructorDemo();
		System.out.println(contructorDemo.carNameString);
		System.out.println(contructorDemo.modelNo);
		
		

	}

}
