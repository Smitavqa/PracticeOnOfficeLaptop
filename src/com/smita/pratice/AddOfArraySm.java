package com.smita.pratice;


public class AddOfArraySm {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4 };
		int sum = 0;
		int lenCount= a.length;
		System.out.println("Array size " + lenCount);
		/*
		 * for (int i = 0; i < a.length; i++) { sum = sum + a[i]; }
		 */
		
		for(int itr :a) {
			sum = sum + itr ;
		}
		System.out.println(sum);

	}

}
