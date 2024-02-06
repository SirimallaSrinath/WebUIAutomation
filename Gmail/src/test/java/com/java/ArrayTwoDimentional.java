package com.java;

public class ArrayTwoDimentional {

	public static void main(String[] args) {

		String[][] data = new String[2][3];
		System.out.println("Rows : "+data.length); //Rows value
		System.out.println("Columns : "+data[0].length); // Columns value

		data[0][0] = "TestScript";
		data[0][1] = "UserName";
		data[0][2] = "password";
		data[1][0] = "TC001";
		data[1][1] = "Admin";
		data[1][2] = "Admin123";
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);

		String[][] data1= {{"EE ID","EE NAME","SALARY"},{"101","SRINATH","81000"},{"222","MAMATHA","75000"},{"333","Anagha","95000"}};
		System.out.println(data1.length);
		System.out.println(data1[0].length);
		System.out.println(data1[2][1]);

	}

}
