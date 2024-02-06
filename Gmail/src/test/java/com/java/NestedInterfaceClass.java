package com.java;

public class NestedInterfaceClass implements NestedInterface,NestedInterface.Itnested{
	
	public void m1() {
		System.out.println("Interface Method");
	}

	
	public void m2() {
		
		System.out.println("Nested Interface Method");
	}
	
	public static void main(String[] args) {
		NestedInterfaceClass obj = new NestedInterfaceClass();
		obj.m1();
		obj.m2();
	}
	
	
}
