package com.mycollpractices;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyMapPractice {

	public static void main(String[] args) {
		Collection<Employee> empList = EmployeeUtil.createEmployees();
		
		Map<Employee.SEX, List<Employee>> empMap = 
				empList.stream().collect(Collectors.groupingBy(Employee::getGender));
		
		Set<Employee.SEX> genderKeys = empMap.keySet();
		
		for(Employee.SEX s : genderKeys) {
			System.out.println("Printing " + s + " employee : ");
			System.out.println(empMap.get(s));
		}
		
		empMap.entrySet().forEach(System.out::println);
	}

}
