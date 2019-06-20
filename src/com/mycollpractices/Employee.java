package com.mycollpractices;

public class Employee implements Comparable<Employee> {
	
	public Employee(long id, String name, double salary, int age, SEX gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}

	public enum SEX {
		MALE, FEMALE
	}
	
	private long id;
	private String name;
	private double salary;
	private int age;
	private SEX gender;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SEX getGender() {
		return gender;
	}
	public void setGender(SEX gender) {
		this.gender = gender;
	}	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	public double getBonus() {
		return salary * 0.01;
	}
	
	public int compareTo(Employee emp) {
		if(this.getSalary() == emp.getSalary()) return 0;
		if(this.getSalary() > emp.getSalary()) return 1;
		return -1;
		//return this.getName().compareTo(emp.getName());
	}
	

}
