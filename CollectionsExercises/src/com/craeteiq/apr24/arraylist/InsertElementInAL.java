package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class InsertElementInAL {
	public static void main(String[] args) {
		List list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		list_Strings.add(0, "Additionally added Brown");
		
		
		
		/*By Using For Each Loop*/
		list_Strings.forEach(System.out::println);
		
	}

}
