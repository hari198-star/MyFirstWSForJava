package com.mycollpractices;

public class Shape {
	
	private String color;
	private String name;
	
	public Shape(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", name=" + name + "]";
	}

}
