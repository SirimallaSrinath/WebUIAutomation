package com.java;

public class It1class implements It1{


	public void m1() {
		System.out.println("m1 method");		
	}

	public void m2() {
		System.out.println("m2 method");	
	}
	
	public static void main(String[] args) {
		It1 Itobj = new It1class();
		Itobj.m1();
		Itobj.m2();
		
	}
}
