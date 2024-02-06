package com.java;

public class ArraySingle {

	public static void main(String[] args) {

		int[] empid = new int[5];
		empid[0] = 111;
		empid[1] = 222;
		empid[2] = 333;
		empid[3] = 444;
		empid[4] = 555;

		//empid[5] = 666;

		System.out.println(empid[0]);
		System.out.
		println(empid[1]);
		System.out.println(empid[2]);
		System.out.println(empid[3]);
		System.out.println(empid[4]);

		//System.out.println(empid[5]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//at com.java.ArraySingle.main(ArraySingle.java:13)
		
		System.out.println("Int Array length : "+empid.length);

	}

}
