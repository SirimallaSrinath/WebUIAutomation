package com.java;

public class InstanceBlock {

	{
		//Instance Block
		System.out.println("Instance Block");	
	}
	
	InstanceBlock(){
		System.out.println("O - Argument Constructor");
	}
	
	InstanceBlock(int i){
		System.out.println("Single - Argument Constructor");
	}
	
	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock();
		new InstanceBlock();
		
		
	}

}
