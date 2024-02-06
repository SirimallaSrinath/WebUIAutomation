package com.java;

abstract class Abstractclass1 {

	void m1() {
		System.out.println("M1 Method");
	}
	abstract void m2();
	abstract void m3();
}

public class Abstractclass extends Abstractclass1{

	void m2() {
		System.out.println("M2 Method");
	}

	void m3() {
		System.out.println("M3 Method");
	}
	
	public static void main(String[] args) {
		Abstractclass obj = new Abstractclass();
		obj.m1();
		obj.m2();
		obj.m3();
		
		//parent abstract class can hold reference for child class object
		
		Abstractclass1 obj1 = new Abstractclass();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}
