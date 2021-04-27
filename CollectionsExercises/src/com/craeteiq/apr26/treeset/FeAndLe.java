package com.craeteiq.apr26.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FeAndLe {
	
	public static void main(String[] args) {
		TreeSet<String> mul_clr=new TreeSet();
		mul_clr.add("Black");
		mul_clr.add("Blue");
		mul_clr.add("Orange");
//		
//		System.out.println(mul_clr.first());
//		System.out.println(mul_clr.last());
//		System.out.println(mul_clr.pollFirst());
//		System.out.println(mul_clr.pollLast());
		
		TreeSet<String> mul=(TreeSet<String>) mul_clr.clone();
	
		System.out.println(mul);
		
		
	}

}
