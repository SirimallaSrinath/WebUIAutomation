package com.java;


class ParentA{
	void m1() {
		System.out.println("Idle");
	}
}
public class Methodoverride extends ParentA{

	//@Override
	void m1() {
		System.out.println("Dosa");
	}
	
	public static void main(String[] args) {
		Methodoverride obj = new Methodoverride();
		obj.m1();
	}
}
