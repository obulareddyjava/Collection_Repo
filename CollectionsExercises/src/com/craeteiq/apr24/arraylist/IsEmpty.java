package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;

public class IsEmpty {
	
	public static void main(String[] args) {
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         c1.removeAll(c1);
         System.out.println(c1.isEmpty());
	}

}
