package com.ajit;

public class Occurance {

	public static void main(String[] args) {
	String string = "i am aj0t sh0ngnareeeeeeeeeeeeeeeeeeeeeee"; 
	string = string.replaceAll(" ", "");
	    char [] c = string.toCharArray();
	    for (int i = 0; i < c.length; i++) {
			if (c[i]=='0') {
				continue;
			}
			int count = 1;
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]='0';
				}
			}
			if (count==1) { //if (count==1) - unique elelemet, //if (count>1) print dublicate //if (count=>1) remove dublicate
				System.out.println(c[i]+": "+ count);
				
			}
		}

	}

}
