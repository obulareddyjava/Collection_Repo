package com.craeteiq.apr25.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseOrderIterator {
	public static void main(String[] args) {
		LinkedList c1= new LinkedList();
	     c1.add("Red");
	     c1.add("Green");
	     c1.add("Black");
	     c1.add("White");
//	     System.out.println(c1);
//	     
//	     Collections.reverse(c1);
//	     System.out.println(c1);
	     
	     Iterator itr=c1.descendingIterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	   
	  
	    
	}

}
