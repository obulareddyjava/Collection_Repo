package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;

public class ReplaceElement {
	public static void main(String[] args) {
		 ArrayList c1= new ArrayList();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         
         c1.set(2, "Double bLack");
         System.out.println(c1.get(2));
	}

}
