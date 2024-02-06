package com.practice;

public class StringcompareTo {
	
	public static void main(String[] args) {
		
		String s1 = new String("Ratan");
		String s2 = new String("Ratan");
		String s3 = new String("ANU");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s2));
	}

}
