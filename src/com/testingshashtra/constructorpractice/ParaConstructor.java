package com.testingshashtra.constructorpractice;

public class ParaConstructor {

	
      int rollNumber;
      String nameString;
      
      protected ParaConstructor() {
    	  rollNumber = 34;
    	  nameString = "Ganesh";
    	  
    	  rollNumber = 39;
    	  nameString = "Shidhi";
    	  
    	  
      }
      public ParaConstructor(int rNo, String nme) {
    	  rollNumber = rNo;
    	  nameString = nme;
    	  
      }
      public static void main(String[] args) {
      
      ParaConstructor ankushConstructor = new ParaConstructor(10,"Ankush");
      System.out.println(ankushConstructor.nameString + "  " +ankushConstructor.rollNumber );
      
      ParaConstructor anghaConstructor = new ParaConstructor(11,"Angha");
      System.out.println(anghaConstructor.rollNumber + "  " + anghaConstructor.nameString);
      
      
      ParaConstructor defaConstructor = new ParaConstructor();
      System.out.println(defaConstructor.rollNumber + "  " + defaConstructor.nameString);
      
      

	}

}
