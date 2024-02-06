package com.practice;

public class StringtoStringBuffer {

	public static void main(String[] args) {
		String s = "AONHEWITT";
		StringBuffer s1 = new StringBuffer(s);
		System.out.println(s1);
		System.out.println(s1.reverse());

		StringBuffer s2 = new StringBuffer("DELL");
		String s3 =  s2.toString();
		System.out.println(s3);

	}

}
