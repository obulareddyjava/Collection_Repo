package com.craeteiq.apr25.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateElementsAll_PossiblaWays {

	
	public static void main(String[] args) {
		 List c1= new LinkedList();
	     c1.add("Red");
	     c1.add("Green");
	     c1.add("Black");
	     c1.add("White");
	     
	    /* for(int i=0;i<c1.size();i++) {
	    	 System.out.println(i+""+c1.get(i));
	     }
	     //
	     for(Object c2:c1) {
	    	 System.out.println(c2);
	     }
	     */
	     /*
	      * 
	      */
	     //by using for each loop 
	     c1.forEach(System.out::println);
	     
	     
	     //By Using Iterator
	     Iterator itr=c1.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	     
	     ListIterator litr=c1.listIterator();
	     while(litr.hasNext()) {
	    	 System.out.println(litr.next());
	     }
	     
	     
	     
	}
}
