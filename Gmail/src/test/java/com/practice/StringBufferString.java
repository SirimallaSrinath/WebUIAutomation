package com.practice;

public class StringBufferString {

	public static void main(String[] args) {

		String s1 = "Ratan";
		s1.concat("Soft");
		System.out.println(s1); // Immutable. Object cann't be updated
		
		StringBuffer sb = new StringBuffer("AON");
		sb.append("Hewitt");
		System.out.println(sb); //Mutable. Object can be updated
		
	}

}
