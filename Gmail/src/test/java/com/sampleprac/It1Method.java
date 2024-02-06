package com.sampleprac;

public class It1Method extends It1Abstract{

	
	public void m1() {
		System.out.println("m1 method");
	}
	
	public void m2() {
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		It1Abstract obj = new It1Method();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
