package com.smita.pratice;



public class StringBufferDemo {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Deepak Java"); // these Sb and Sb2 are are referring to the differnt objects 
    //StringBuffer sb2 = new StringBuffer("Deepak Java");// so that why we are gettin false result
	//System.out.println(sb.charAt(3));
	//System.out.println(sb.delete(2, 5));
	//System.out.println(sb.equals(sb2));
//	System.out.println("Original String:: "+ sb + " "+  " Delete perticular character:: "+ sb.deleteCharAt(3) );
  //   System.out.println(sb.indexOf("a"));
   // System.out.println(sb.lastIndexOf("a"));
   // System.out.println(sb.insert(3, "oooooo"));
	//System.out.println(sb.replace(6, 6, "-kumar"));
	//System.out.println(sb.replace(3, 6, "m"));
	//System.out.println(sb.reverse());
  String string = new String("Deepak Java");
  String string1 = new String("Deepak Java");
  System.out.println (string.contentEquals(string1));
	
	
    
    
	}

}
