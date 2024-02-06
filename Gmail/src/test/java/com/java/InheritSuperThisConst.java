package com.java;


class Parent1{
	
	Parent1(){
		System.out.println("Parent class o-arg constructor");
	}
	Parent1(int i){
		this();
		System.out.println("Parent class 1-org constructor");
	}
}

public class InheritSuperThisConst extends Parent1{
	
	InheritSuperThisConst(int i, int j){
		super(10);
		System.out.println("Child class 2-org constructor");
	}

	public static void main(String[] args) {
		
		InheritSuperThisConst obj = new InheritSuperThisConst(1000, 2000);
				
	}
}
