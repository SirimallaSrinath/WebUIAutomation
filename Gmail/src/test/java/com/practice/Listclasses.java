package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listclasses {
	public static void main(String[] args) {

		int[][] intobj = new int[3][2];
		int leng = intobj.length;
		System.out.println(leng);

		String[][] objarray = {{"Ratan","Durga"},{"Sri","Ram"},{"Jai","Ram"}};
		/*
		 * System.out.println(objarray[0][0]); System.out.println(objarray[0][1]);
		 * System.out.println(objarray[1][0]); System.out.println(objarray[1][1]);
		 * System.out.println(objarray[2][0]); System.out.println(objarray[2][1]);
		 */

		for(int i=0;i<objarray.length;i++) {
			for(int j=0;j<objarray[0].length;j++) {
				System.out.println(objarray[i][j]);
			}}

		List<String> obj = new ArrayList<String>();
		System.out.println(obj.isEmpty());

		obj.add("QTP");
		obj.add("Selenium");
		obj.add("QTP");
		obj.add("C++");
		obj.add("UFT");
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println("ArrayList contains UFT : "+obj.contains("UFT"));
		obj.remove("UFT");
		System.out.println("ArrayList contains UFT : "+obj.contains("UFT"));
		System.out.println(obj);
		System.out.println(obj.size());

		Set<String> setobj = new HashSet<>();
		setobj.add("Java");
		setobj.add("Python");
		setobj.add("Ruby");
		setobj.add("Java");
		System.out.println(setobj);
		System.out.println(setobj.toString());
		System.out.println(setobj.size());

	}

}
