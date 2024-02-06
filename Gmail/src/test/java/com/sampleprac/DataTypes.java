package com.sampleprac;

public class DataTypes {

	public static void main(String[] args) {

		int intdata = 128;
		double doubledata = 125.28;
		boolean boldata = true;
		char chardata = 'F';
		String strdata = "API Testing";

		System.out.println(intdata);
		System.out.println(doubledata);
		System.out.println(boldata);
		System.out.println(chardata);
		System.out.println(strdata);

		int[] array1 = new int[5];
		array1[0] = 101;
		array1[1] = 102;
		array1[2] = 103;
		array1[3] = 104;
		array1[4] = 105;

		System.out.println("Row length: "+array1.length);
		System.out.println("104 data to print: "+array1[3]);
		
		String[][] array2 = {{"TC","Username","Password"},{"001","Admin","Admin123"}};
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);
		System.out.println("Row length: "+array2.length);
		System.out.println("Columns length :"+array2[0].length);
	}

}
