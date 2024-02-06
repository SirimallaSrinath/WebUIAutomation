package com.practice;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = new String(" Hello All How Are You ");
		String s2 = new String("How is your day");

		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.contains("All"));
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		System.out.println(s1.startsWith(" He"));
		System.out.println(s1.endsWith("ou "));
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(1, 10));
		System.out.println(s1.concat(s2));
		String[] splitdata = s2.split(" ");
		for(String each:splitdata) {
			System.out.println(each);
		}
		System.out.println(s2);
		System.out.println(s2.replace("your", "you"));
		System.out.println(s2.replaceAll("How is your", "Good"));
		System.out.println(s2.replace("o","a"));
		
		char[] chardata = s2.toCharArray();
		for(char data:chardata) {
			System.out.println(data);
		}
	}

}
