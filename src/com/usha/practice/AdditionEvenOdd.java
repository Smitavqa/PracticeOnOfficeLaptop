package com.usha.practice;

import java.util.Scanner;

public class AdditionEvenOdd {
	
	 public void AdditionEvenOddM() {
		 
	 }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        
        while(temp>0) {
        	sum = sum + temp %10;
        	temp = temp/10;
        	
        }
        System.out.println("The sum of digit is "+ sum);
        
        if (sum % 2 == 0) {
        	System.out.println("The sum is even ");
        }else {
        	System.out.println("The sum is Odd ");
        }
       
	}

}
