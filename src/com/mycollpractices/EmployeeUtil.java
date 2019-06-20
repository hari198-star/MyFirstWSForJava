package com.mycollpractices;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeUtil {
	
	public static Collection<Employee> createEmployees() {
		Collection<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "abc1", 10005, 35, Employee.SEX.MALE));
		empList.add(new Employee(2, "abc2", 20000, 25, Employee.SEX.FEMALE));
		empList.add(new Employee(3, "abc3", 15000, 30, Employee.SEX.MALE));
		empList.add(new Employee(4, "abc4", 30000, 28, Employee.SEX.FEMALE));
		empList.add(new Employee(5, "abc5", 27000, 33, Employee.SEX.MALE));
		empList.add(new Employee(6, "abc6", 34000, 22, Employee.SEX.MALE));
		empList.add(new Employee(7, "abc7", 26000, 28, Employee.SEX.MALE));
		empList.add(new Employee(8, "abc8", 29000, 40, Employee.SEX.FEMALE));
		empList.add(new Employee(9, "abc9", 45000, 25, Employee.SEX.MALE));
		
		return empList;
	}

}
