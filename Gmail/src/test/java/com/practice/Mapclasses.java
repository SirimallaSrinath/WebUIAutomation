package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapclasses {
	public static void main(String[] args) {
		
		Map<String,String> mapobj = new HashMap<String,String>();
		System.out.println(mapobj.isEmpty());
		mapobj.put("Username", "Admin");
		mapobj.put("Testcase", "TC001");
		mapobj.put("Password", "Admin001");
		System.out.println("Hashmap data: "+mapobj);
		/*
		 * System.out.println("Testcase value: "+mapobj.get("Testcase"));
		 * System.out.println(mapobj.size());
		 */
		
		Map<String,String> treemapobj = new TreeMap<String,String>();
		treemapobj.putAll(mapobj);
		System.out.println("Tree map data: "+treemapobj);
		
	}

}
