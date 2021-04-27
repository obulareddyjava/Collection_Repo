package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;

public class TwoArrayJOin {
	
	public static void main(String[] args) {
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         System.out.println("List of first array: " + c1);
         ArrayList<String> c2= new ArrayList<String>();
         c2.add("Red");
         c2.add("Green");
         c2.add("Black");
         c2.add("Pink");
         System.out.println("List of second array: " + c2);
         
         ArrayList<String> c3= new ArrayList<String>();
         c3.addAll(c1);
         c3.addAll(c2);
         
         c3.forEach(c4->System.out.println(c4));
         
         
	}

}
