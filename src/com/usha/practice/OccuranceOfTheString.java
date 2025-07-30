package com.usha.practice;

import java.util.HashMap;
import java.util.Map.Entry;

import java.util.*;
public class OccuranceOfTheString {

	 public static void main(String[] args) {
         String nam = "I am in the mentor session in class";
         
     //  char[] ch =  nam.toCharArray();
     String [] st = nam.split(" ");
      HashMap  <String, Integer> hs = new HashMap<>();
      
      for(String c: st){
          if(hs.containsKey(c)){
              hs.put(c, hs.get(c)+1);
              
          }else
         hs.put(c,1);
      } //System.out.println(hs);
      for(Entry<String, Integer> e:hs.entrySet()) { //  for(Map.Entry<String, Integer> e:hs.entrySet()) { // c:ch
        if( e.getValue()>=1){
         System.out.println(e.getKey()+ " " +e.getValue());
         
        }
      }
	 }
}
