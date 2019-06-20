package com.methodreferences;


interface MyInterface {
	int run(int a, int b);
}

class MyClass {
	static int calculate(int q, int b) {
		return q * b;
	}
}

public class MyPractice {
	
	public static void main(String[] a) {
		MyPractice mp = new MyPractice();
		mp.test();
		
	}
	
	public void calci(int a, int b, MyInterface mi) {
		System.out.println(mi.run(a, b));
	}
	
	public void test() {
		
		MyInterface mi = MyClass::calculate;
		
		this.calci(10, 20, mi);
		
	}
	
}
