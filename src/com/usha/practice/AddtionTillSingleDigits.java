package com.usha.practice;

import java.util.Scanner;

public class AddtionTillSingleDigits {
	
	public static int getSingleDigitSum(int num) {
		int sum;
		
		do {
			sum = 0;
			while(num > 0) {
				sum = sum + num % 10;
				num= num/10;
			}
			num=sum;
		} while(sum >= 10);
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 digits number");
		int number = scanner.nextInt();
		
		if(number<1000 || number > 9999){
			System.out.println("Please enter a valid 4-digit number.");
		}else {
			int singleDigitSum = getSingleDigitSum(number);
			System.out.println("The single-digit sum is: " + singleDigitSum);
		}
		
	}

}
