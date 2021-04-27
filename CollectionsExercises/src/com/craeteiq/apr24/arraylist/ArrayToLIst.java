package com.craeteiq.apr24.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToLIst {
	
	public static void main(String[] args) {
		
		
	

	List list=Arrays.asList(1,2,3,2);
	Collections.synchronizedList(list);
	list.forEach(System.out::println);
	
	Object[] in=list.toArray();
	System.out.print(in);
	
	}
}
