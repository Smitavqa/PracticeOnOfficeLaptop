package com.stringdemo;

public class ParaConstructorDemo {

	String bookNameString;
	String autorNameString;
	int publicationYearDouble;

	public ParaConstructorDemo(String BookNM, String AutorNM, int PublicationYR) {

		bookNameString = BookNM;
		autorNameString = AutorNM;
		publicationYearDouble = PublicationYR;

	}

	public static void main(String[] args) {
		ParaConstructorDemo p1Obj = new ParaConstructorDemo("Tara", "Chandra kumar", 2024);
		System.out.println(p1Obj.bookNameString + "" + p1Obj.autorNameString + " " + p1Obj.publicationYearDouble);

		ParaConstructorDemo p2Obj = new ParaConstructorDemo("Nakshara", "Shekar shaha", 2023);
		System.out.println(p2Obj.bookNameString + "" + p2Obj.autorNameString + " " + p2Obj.publicationYearDouble);

	}

}
