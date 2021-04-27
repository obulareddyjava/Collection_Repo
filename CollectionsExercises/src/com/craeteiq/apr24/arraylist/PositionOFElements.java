package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;

public class PositionOFElements {
	
	public static void main(String[] args) {
		 ArrayList c1= new ArrayList();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         
         for(int i=0;i<c1.size();i++) {
        	 System.out.println("Index Value is"+i+" "+c1.get(i));
        	 
         }
	}

}
