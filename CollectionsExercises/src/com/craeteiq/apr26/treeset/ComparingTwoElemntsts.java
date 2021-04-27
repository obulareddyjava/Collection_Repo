package com.craeteiq.apr26.treeset;

import java.util.TreeSet;

public class ComparingTwoElemntsts {
	
	public static void main(String[] args) {
		TreeSet<String> mul_clr=new TreeSet();
		mul_clr.add("Black");
		mul_clr.add("Blue");
		mul_clr.add("Orange");
		
		TreeSet<String> mul_clr1=new TreeSet();
		mul_clr1.add("Black");
		mul_clr1.add("Blue");
		mul_clr1.add("Orange");
		
		for(String ele:mul_clr) {
			System.out.println(mul_clr1.contains(ele) ? "Yes" : "NO");
		}
		
		
	}

}
