package com.craeteiq.apr25.linkedlist;

import java.util.LinkedList;

public class ReplaceElement {
	public static void main(String[] args) {
		
	
	LinkedList c1= new LinkedList();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    
    c1.set(0, "Yellow");
   
    c1.forEach(System.out::println);
    
	}

}
