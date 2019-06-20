package com.mycollpractices;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeCollectionsPractice {

	public static void main(String[] args) {
		
		Collection<Employee> empList = EmployeeUtil.createEmployees();
		
		Predicate<Employee> genderPredicate = e -> e.getGender().equals(Employee.SEX.MALE);
		Predicate<Employee> predicate = e -> e.getSalary() > 20000;
		
		EmployeeCollectionsPractice practice = new EmployeeCollectionsPractice();
		practice.printEmployees(empList, predicate, genderPredicate);
		
		practice.printSumOfSalaries(empList);
		
		practice.printBonus(empList, e -> e.getBonus());
		
		empList.stream().map(e -> e.getName()).collect(Collectors.joining(", "));
	}
	
	void printEmployees(Collection<Employee> empList, Predicate<Employee> predicate, Predicate<Employee> genderPredicate) {
		empList.stream().filter(predicate.and(genderPredicate)).forEach(e -> System.out.println(e.getId() + " " + e.getName()));
	}
	
	void printSumOfSalaries(Collection<Employee> empList) {
		Double salary = empList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
		System.out.println(salary);
	}
	
	void printBonus(Collection<Employee> empList, Function<Employee, Double> bonus) {
		empList.stream().map(bonus).forEach(b -> System.out.println(b));
	}

}
