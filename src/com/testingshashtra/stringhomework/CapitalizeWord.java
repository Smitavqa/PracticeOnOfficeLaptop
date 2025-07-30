package com.testingshashtra.stringhomework;

public class CapitalizeWord {
	
	public static void main(String[] args) {
		String cap = " I am a good girl";

		for (int j = 0; j < cap.length(); j++) {

			String[] psrtStrings = cap.split(" "); {
				if(cap.charAt(j)!=' ')
				{
					System.out.println(psrtStrings[j].toLowerCase());
				}
			System.out.println(psrtStrings[j].toUpperCase());
			 
			}
			 
				
			}
		}

	}
