package com.practice;

import java.util.ArrayList;

public class ListAddAll {
	
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ratan");
		obj.add("Durga Soft");
		
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Alight");
		
		ArrayList<String> obj2 = new ArrayList<String>();
		obj2.add("Hyderabad");
		obj2.addAll(obj);
		obj2.addAll(obj1);
		System.out.println(obj2);
		System.out.println(obj2.size());
		
		
	}

}
