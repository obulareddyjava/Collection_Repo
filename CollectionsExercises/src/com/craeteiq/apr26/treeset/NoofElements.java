package com.craeteiq.apr26.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class NoofElements {
	public static void main(String[] args) {
		TreeSet<Integer> n=new TreeSet();
		TreeSet<Integer> head=new TreeSet();
		n.add(1);
		n.add(22);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.add(7);
		n.add(8);
		n.add(9);
		n.add(100);
		
		head= (TreeSet)n.headSet(7);
		Iterator itr=head.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
		
		
		
		
	}

}
