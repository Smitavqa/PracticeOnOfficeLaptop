package com.Testingshastr.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		String string1 = new String("Smita");
		String string2 = new String("Vishwas");
		String string3 = new String("Raj");
		String string4 = new String("Amruta");
		String string5 = new String("Bipin");
		
		TreeSet tSet = new TreeSet<>();
		tSet.add(string1);
		tSet.add(string2);
		tSet.add(string3);
		tSet.add(string5);
		tSet.add(string4);
	// ===============
		
		System.out.println(tSet);
		
		StringBuffer strin1 = new StringBuffer("mita");
		StringBuffer strin2 = new StringBuffer("ishu");
		StringBuffer strin3 = new StringBuffer("mruti");
		StringBuffer strin4 = new StringBuffer("tara");
		StringBuffer strin5 = new StringBuffer("Amar");
		
		TreeSet tSet2 = new TreeSet<>();
		tSet2 .add(strin1);
		tSet2 .add(strin2);
		tSet2 .add(strin3);
		tSet2 .add(strin4);
		tSet2 .add(strin5);
		System.out.println("Stringbuffer result " + tSet2 );
		
		
		StringBuilder stringBuilder1 = new StringBuilder("Zara");
		StringBuilder stringBuilder2 = new StringBuilder(1);
		StringBuilder stringBuilder3 = new StringBuilder("Tushar");
	
		
		TreeSet tSet3 = new TreeSet<>();
		tSet3.add(stringBuilder1);
		tSet3.add(stringBuilder2);
		tSet3.add(stringBuilder3);
		
		System.out.println("Stringbuilder sequnce" + tSet3);
		
		
		
				
		
	}

}
