package com.java;

public class InstanceBlock1 {

	int a;
	{
		System.out.println("Instance Block");
		a = 111;
	}

	void m1() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		new InstanceBlock1().m1();
	}
}
