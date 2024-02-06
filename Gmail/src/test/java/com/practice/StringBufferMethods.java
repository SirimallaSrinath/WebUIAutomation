package com.practice;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Hello World");
		s1.append(" Good Morning!");
		System.out.println(s1);
		
		System.out.println(s1.charAt(1));
		s1.reverse();
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.insert(6, "Beautiful ");
		System.out.println(s1);
		s1.replace(6, 15, "Nice");
		System.out.println(s1);
		s1.delete(6, 10);
		System.out.println(s1);
	}

}
