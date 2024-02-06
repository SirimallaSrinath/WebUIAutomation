package com.java;

public class AllFiveClassElements {
	
	int a = 10; //instance variable
	static String b = "ratan"; //static variable
	
	void m1() {
		System.out.println("Instance Method");
	}
	static void m2() {
		System.out.println("Static Method");
	}
	
	AllFiveClassElements() {
	System.out.println("0-arg COnstructor");	
	}
	
	AllFiveClassElements(int c){
		System.out.println("1-arg constructor");
	}
	
	{System.out.println("Instance Block");}
	static {System.out.println("Static Block");}
	
	public static void main(String[] args) {
		AllFiveClassElements obj =  new AllFiveClassElements();
		new AllFiveClassElements(10);
		obj.m1();
		AllFiveClassElements.m2();
	}
	
}
