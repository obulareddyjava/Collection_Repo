package com.craeteiq.apr26.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Clone {
	
	public static void main(String[] args) {
		Set<String> mul_clr=new TreeSet();
		mul_clr.add("Black");
		mul_clr.add("Blue");
		mul_clr.add("Orange");
		
		Set<String> mul=new TreeSet();
		mul.addAll(mul_clr);
		
		System.out.println(mul);
		
	}

}
