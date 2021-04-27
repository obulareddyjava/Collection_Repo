package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
	
	public static void main(String[] args) {
		ArrayList<String> list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		
		list_Strings.forEach(list->System.out.println(list));
		
		Collections.swap(list_Strings, 0, 3);
		
		list_Strings.forEach(list->System.out.println(list));
	}

}
