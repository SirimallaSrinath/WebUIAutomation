package com.java;

public class Constructor1 {

	Constructor1(){
		this(10);
		System.out.println("Zero Argument Constructor");
	}

	Constructor1(int i){
		this(10,20);
		System.out.println("Single Argument Constructor");
	}

	Constructor1(int i,int j){
		System.out.println("Two Argument Constructor");
	}
	public static void main(String[] args) {
		Constructor1 obj = new Constructor1();
		// nameless object
		new Constructor1(); 
	}
}
