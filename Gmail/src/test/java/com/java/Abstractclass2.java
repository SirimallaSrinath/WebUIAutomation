package com.java;

abstract class Parentabstract{
	Parentabstract(){
		System.out.println("abstract class 0-arg constructor");
	}
}

public class Abstractclass2 extends Parentabstract{
	Abstractclass2(){
		super();
		System.out.println("Normal class 0-arg constructor");
	}
	public static void main(String[ ] args) {
		Abstractclass2 obj = new Abstractclass2();
		
	}

}
