package com.package2;


import com.package1.PackageOne;

public class PackageTwo extends PackageOne{
	
	public void m1() {
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		PackageTwo bPackageTwo = new PackageTwo();
		bPackageTwo.m1();
	}

}
