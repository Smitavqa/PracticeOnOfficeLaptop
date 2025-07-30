package com.usha.practice;
import java.util.*;

public class RemoveDuplicateElementFromString {
	
	 public static void main(String[] args) {
         String nam = "I am in the mentor session";
         
       char[] ch =  nam.toCharArray();
      HashMap  <Character, Integer> hs = new HashMap();
      
      for(char c: ch){
          if(hs.containsKey(c)){
              hs.put(c, hs.get(c)+1);
              
          }else
         hs.put(c,1);
      } //System.out.println(hs);
      for(Map.Entry<Character, Integer> e:hs.entrySet()) { // c:ch
        if( e.getValue()>=1){
         System.out.println(e.getKey()+ " " +e.getValue());
         
        }
      }
	 }
}
