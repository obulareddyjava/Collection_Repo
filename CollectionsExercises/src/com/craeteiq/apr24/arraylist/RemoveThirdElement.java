package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {
	public static void main(String[] args) {
		
	
	List list_Strings=new ArrayList();
	list_Strings.add("Red");
	list_Strings.add("White");
	list_Strings.add("Blue");
	list_Strings.add("Orange");
	
	System.out.println(list_Strings.get(list_Strings.size()-3));

}
}
