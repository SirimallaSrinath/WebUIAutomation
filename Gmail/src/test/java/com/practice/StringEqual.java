package com.practice;

public class StringEqual {

	StringEqual(String name){
	}

	public static void main(String[] args) {

		StringEqual obj1 = new StringEqual("AON");
		StringEqual obj2 = new StringEqual("AON");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		
		String s1 = "SRI";
		String s2 = "SRI";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("HEWITT");
		String s4 = new String("HEWITT");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		StringBuffer sb1 = new StringBuffer("HI");
		StringBuffer sb2 = new StringBuffer("HI");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
	}
}
