package com.testshashtra.method;

public class MethodProgram {
	
	/**
	 * @param number
	 * @return
	 */
	public boolean isPalindrom(int number) {
		
		int reverse = 0;
		int temp = number;
		while(temp != 0) {
			int digit = temp%10;
			reverse = digit * 10 + reverse;
			temp = temp/10;
			
		}
		return number == reverse;
	}

	public static void main(String[] args) {
		MethodProgram mProgram = new MethodProgram();
	mProgram.isPalindrom(565);

	}

}
