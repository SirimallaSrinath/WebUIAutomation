package com.practice;

public class D extends C implements C.empc{

	public void empc() {
		System.out.println("abstract method inside interface of normal class");
	}
	
	public static void main(String[] args) {
		D obj = new D();
		obj.mc1();
		obj.empc();
	}
}
