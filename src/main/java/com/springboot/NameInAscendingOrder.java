package com.springboot;

import java.util.Comparator;



public class NameInAscendingOrder implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o2.getName().compareTo(o1.getName());
	}
	
}
