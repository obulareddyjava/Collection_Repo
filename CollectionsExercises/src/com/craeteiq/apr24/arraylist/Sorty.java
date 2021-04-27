package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sorty  {
	
	public static void main(String[] args) {
		List list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		System.out.println("Before Sorting"+list_Strings);
		Collections.sort(list_Strings);
		
		System.out.println("After Sorting :"+list_Strings);
		
	
	}


	
}
