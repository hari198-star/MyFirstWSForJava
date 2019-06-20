package com.mycollpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MySetPractices {

	public static void main(String[] args) {
		Collection<Employee> empList = EmployeeUtil.createEmployees();
		
		Set<String> empNamesSet = empList.stream().map(Employee::getName).
				collect(Collectors.toCollection(LinkedHashSet::new));
		
		System.out.println(empNamesSet);
		
		TreeSet<Employee> ts = new TreeSet<>(empList);
		
		System.out.println(ts);
		
		Employee[] empArray = ts.toArray(new Employee[0]);
				
		Set<Employee> empSet = new TreeSet(Arrays.asList(empArray));
		Set<String> empNamesTreeSet = 
		   empSet.stream().map(Employee::getName).
		   collect(Collectors.toCollection(TreeSet::new));
		System.out.println(empNamesTreeSet);
	}

}
