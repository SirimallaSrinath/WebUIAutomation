package com.sampleprac;

abstract class abstractclass{
	void n1() {
		System.out.println("n1 method");
	}
	abstract void n2();
	
	abstractclass(){
		System.out.println("Abstract class 0-Arg Constructor");
	}
}

public class NormalClassAbstract extends abstractclass{
	
	void n2() {
		System.out.println("n2 method");
	}
	
	NormalClassAbstract(){
		super();
		System.out.println("Normal class 0-Arg Constructor");
	}
	
	public static void main(String[] args) {
		//NormalClassAbstract obj = new NormalClassAbstract();
		
		abstractclass obj1 = new NormalClassAbstract();
		obj1.n1();
		obj1.n2();
		
	}
}
