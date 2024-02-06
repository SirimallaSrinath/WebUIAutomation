package com.java;

public class StaticBlock1 {

	static int a;
	static{
		a = 111;
	}
	static void m1() {
		System.out.println(StaticBlock1.a);
	}

	public static void main(String[] args) {
		StaticBlock1.m1();
	}
}
