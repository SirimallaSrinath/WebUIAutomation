package com.java;

public class It3childclass implements It3{

	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	public void m4() {
		System.out.println("m4 method");
	}

	public static void main(String[] args) {
		It3 obj = new It3childclass();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
	
}
