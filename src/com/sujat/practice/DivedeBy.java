package com.sujat.practice;

import com.friend.practice.ReversStringDemo;

public class DivedeBy {

	public static void main(String[] args) {
	int a = 123;
     int temp = a;
     int rem, rev=0;
     while(temp!=0) {
    	 temp = temp%10;
    	 rem = temp;
    	 System.out.println(temp);   	 
    	rem = rev*10+rem;
    	
    	 System.out.println(temp);  
    	
    	 
    	 
     }
	}

}
