package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterarateWaysAL {
	
	public static void main(String[] args) {
		List list_Strings=new ArrayList();
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Blue");
		list_Strings.add("Orange");
		list_Strings.add(0, "Additionally added");
		
		/*By Using For Each Loop*/
		list_Strings.forEach(System.out::println);
		
		/*By Using Iterator*/
		Iterator itr=list_Strings.iterator();
		while(itr.hasNext()) 
			System.out.println(itr.next());
	
	/*By Using ListIteraror
	 * 
	 */
	ListIterator<String> ltr1=list_Strings.listIterator();
	while(ltr1.hasNext()) 
		System.out.println(ltr1.next());
	
	/*By Using Array Index
	 * 
	 */
	
	for(int i=0;i<list_Strings.size();i++) {
		System.out.println("Index Value "+i+" "+list_Strings.get(i));
		
	}
	
	
}
}
