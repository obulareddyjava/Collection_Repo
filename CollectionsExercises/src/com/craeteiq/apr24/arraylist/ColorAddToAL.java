package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ColorAddToAL {
	
	public static void main(String[] args) {
		List list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		
		list_Strings.forEach(lists->System.out.println(lists));
		
		list_Strings.forEach(System.out::println);
	}

}
