package com.mycollpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
	
	public static void main(String[] a) {
		Collection<Employee> empList = EmployeeUtil.createEmployees();
		
		Iterator<Employee> empIterator = empList.iterator();
		
		while(empIterator.hasNext()) {
			System.out.println(empIterator.next());
		}
		
		System.out.println(empList.size());
		
		Comparator<Employee> empComp = (e1, e2) -> {
			if(e1.getAge() == e2.getAge()) return 0;
			if(e1.getAge() > e2.getAge()) return 1;
			return -1;
		};
		
		Employee[] empArray = empList.toArray(new Employee[0]);
		Arrays.sort(empArray, empComp);
		
		for(int i = 0; i <empArray.length; i++) {
			System.out.println(empArray[i]);
		}
		
		empList = Arrays.asList(empArray);
		
		empList.forEach(e -> System.out.println(e));
		
		Integer[] intList = {1, 2, 3, 4, 1, 5, 6, 7, 2, 1};
		List<Integer> al = new ArrayList(Arrays.asList(intList));
		al.remove(1);
		System.out.println(al);
	}

}
