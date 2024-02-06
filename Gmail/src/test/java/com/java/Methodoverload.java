package com.java;

public class Methodoverload {
	
	void m1(int a) {
		System.out.println(a);
	}

	void m1(int a,int b) {
		System.out.println(a+b);
	}
	
	void m1(int a, double c) {
		System.out.println(a+c);
	}
	
	public static void main(String[] args) {
		Methodoverload obj = new Methodoverload();
		obj.m1(10);
		obj.m1(10, 20);
		obj.m1(10, 20.02);
	}
}
