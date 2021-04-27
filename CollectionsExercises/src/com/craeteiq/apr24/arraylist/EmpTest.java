package com.craeteiq.apr24.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmpTest {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(3, "Balaji"));
		employees.add(new Employee(2, "Raja"));
		employees.add(new Employee(1, "Roy"));
		employees.add(new Employee(4, "Rani"));
		
		Employee emp=new Employee();
		//employees.forEach(System.out::println);
		//implements comparable
		Collections.sort(employees);
		System.out.println(employees);
		
		Comparator<Employee> newsort=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.geteName().compareTo(o2.geteName());
			}
			};
			
			Collections.sort(employees, newsort);
			System.out.println(employees);
		
		
		
		
		
		
	}

}
