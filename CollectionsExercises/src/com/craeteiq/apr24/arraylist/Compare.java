package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Compare {
	public static void main(String[] args) {
		ArrayList<String> list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		
		ArrayList<String> list_Strings1=new ArrayList();
		
		list_Strings1.add("Red");
		ArrayList<String> l3=new ArrayList();
		
		for(String s3:list_Strings) {
			l3.add(list_Strings1.contains(s3) ?"Yes":"No");
			}
		System.out.println(l3);
		
	}

}
