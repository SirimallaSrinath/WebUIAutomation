package com.java;

class Inheritancefather{
	void m1() {
		System.out.println("Father Properties");
	}
}

class Inheritancechild extends Inheritancefather{

	void m2() {
		System.out.println("Child Properties");
	}

	public static void main(String[] args) {
		Inheritancechild obj = new Inheritancechild();
		obj.m1();
		obj.m2();
	}
}