package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;

public class TrimTheCapacity {
	
	public static void main(String[] args) {
		 ArrayList c1= new ArrayList();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         c1.forEach(System.out::println);
         System.out.println(c1.size());
         c1.trimToSize();
         System.out.println(c1);
         
	}

}
