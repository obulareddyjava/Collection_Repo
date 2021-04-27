package com.craeteiq.apr26.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Reverse {
	
	public static void main(String[] args) {
		TreeSet<String> mul_clr=new TreeSet();
		mul_clr.add("Black");
		mul_clr.add("Blue");
		mul_clr.add("Orange");
		
		System.out.println();
		
		Iterator itr=mul_clr.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
