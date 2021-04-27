package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mutation {
	public static void main(String[] args) {
		
		List list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		
		List list2=new ArrayList();
		list2.addAll(list_Strings);
		System.out.println(list_Strings);
		
		Collections.copy(list_Strings, list2);
		
	}

}
