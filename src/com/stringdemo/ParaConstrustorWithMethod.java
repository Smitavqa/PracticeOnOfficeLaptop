package com.stringdemo;

public class ParaConstrustorWithMethod {

	String carName;
	String modelNumner;
	int ModelYear;
	
	public  ParaConstrustorWithMethod(String Carnm, String modelNo, int ModelYr ) {
		 carName = Carnm;
		 modelNumner =modelNo;
		 ModelYear= ModelYr;
		
	}
	
	public void display() {
		System.out.println("Car name is  "+carName + "  Model no. is   "+ modelNumner + " ModelNo. is   " + ModelYear);
	}
	
	public static void main(String[] args) {
	
		 ParaConstrustorWithMethod prefernace = new  ParaConstrustorWithMethod("Alto", "Alto_AZ", 2024);
		 prefernace.display();
		 ParaConstrustorWithMethod prefernace1 = new  ParaConstrustorWithMethod("Hondacity", "Hondacity_HJ", 2022);
		 prefernace1.display();
	 

	}

}
