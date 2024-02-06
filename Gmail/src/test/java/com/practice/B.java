package com.practice;

public class B extends A implements A.Emp{

	public void n1() {
		System.out.println("n1 method");
	}
	public void n2() {
		System.out.println("n2 method");
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.n1();
		obj.n2();
	}
}
