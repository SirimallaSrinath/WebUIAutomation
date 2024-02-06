package com.java;

public class InstanceStaticMethod {
	
	void m1() {
		System.out.println("Instance Method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		InstanceStaticMethod ism = new InstanceStaticMethod();
		ism.m1();
		InstanceStaticMethod.m2();
		
	}

}
