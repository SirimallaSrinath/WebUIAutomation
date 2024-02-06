package com.java;

public class StaticBlock {
	
	static {
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}
	
	{
		System.out.println("instance block 1");
	}
	
	{
		System.out.println("instance block 2");
	}
	
	StaticBlock(){
		System.out.println("o-arg constructor");
	}
	StaticBlock(int i){
		System.out.println("1-arg constructor");
	}
	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock(10);
	}
}
