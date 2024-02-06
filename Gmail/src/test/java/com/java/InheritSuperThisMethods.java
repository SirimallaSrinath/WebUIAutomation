package com.java;

class Parent {
	void m1() {
		System.out.println("Parent m1 method");
	}
}

public class InheritSuperThisMethods extends Parent{
	
	void m1() {
		System.out.println("Child m1 method");
	}
	void m2() {
		super.m1();
		this.m1();
		
	}
	
	public static void main(String[] args) {
		InheritSuperThisMethods obj = new InheritSuperThisMethods();
		obj.m2();
		
	}
}
