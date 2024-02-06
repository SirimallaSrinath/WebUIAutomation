package com.java;

class Inheritparent{
	int a = 10;
	int b = 20;
}

public class InheritSuperThis extends Inheritparent{
	
	int a = 100;
	int b = 200;
	
	void m1(int a,int b) {
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
	
	public static void main(String[] args) {
		
		InheritSuperThis obj = new InheritSuperThis();
		obj.m1(1000, 2000);
		
	}
}

