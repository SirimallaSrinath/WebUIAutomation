package com.practice;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String s1 = "Ratan";
		String s2 = new String("Pavan");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String[][] ab = new String[3][2];
		ab[0][0] = "A";
		ab[0][1] = "B";
		ab[1][0] = "C";
		ab[1][1] = "D";
		ab[2][0] = "E";
		ab[2][1] = "F";
		
		for(int i=0;i<ab.length;i++) {
			for(int j=0;j<ab[0].length;j++) {
				System.out.println(ab[i][j]);
			}
		}
		
		char[] ch = {'a','b','c','d','e'};
		
		for (int i=0;i<ch.length;i++) {
			System.out.println("Array values: "+ch[i]);
		}
		
		String s3 = new String(ch);
		System.out.println(s3);
		
		String s4 = new String(ch,1,2);
		System.out.println(s4);
		
		byte[] bt = {65,66,67,68,69,70};
		String s5 = new String(bt);
		System.out.println(s5);
		String s6 = new String(bt,1,5);
		System.out.println(s6);
	}

}
