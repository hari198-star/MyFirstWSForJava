package com.mycollpractices;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSetPractice {

	public static void main(String[] args) {
		TreeSet<Employee> empTreeSet = 
				new TreeSet<>((e1, e2) -> {
					if(e1.getId() == e2.getId()) return 0;
					if(e1.getId() > e2.getId()) return -1;
					return 1;
		});
		empTreeSet.addAll(EmployeeUtil.createEmployees());
		
		empTreeSet.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		SortedSet<Employee> empRange = 
				empTreeSet.tailSet(new Employee(5, "abc5", 27000, 33, Employee.SEX.MALE));
		empRange.forEach(System.out::println);
	}

}
