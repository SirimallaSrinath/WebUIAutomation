package com.sampleprac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionInterface {

	public static void main(String[] args) {

		List<String> data = new ArrayList<String>();
		data.add("PlayWright");
		data.add("Selenium");
		data.add("Javascript");
		data.add("Cypress");
		data.add("Puppeteer");

		System.out.println("Data is empty: "+data.isEmpty());

		System.out.println(data);
		data.remove("Javascript");
		System.out.println(data);
		
		System.out.println("List contains PlayWright : "+data.contains("PlayWright"));
		System.out.println("Second index data is : "+data.get(1));
		System.out.println("Total data count is: "+data.size());

		data.clear(); 
		System.out.println("Data cleared : "+data);
		System.out.println("Data is empty: "+data.isEmpty());
		
		Set<String> setdata = new TreeSet<String>();
		setdata.add("Ruby");
		setdata.add("Python");
		setdata.add("Java");
		setdata.add("JavaScript");
		setdata.add("C");
		setdata.add("TypeScript");
		System.out.println(setdata);
		
		Map<String,String> mapdata = new LinkedHashMap<String, String>();
		mapdata.put("UserName", "Admin");
		mapdata.put("Password", "admin123");
		mapdata.put("Salary", "25212");
		System.out.println("EE record: "+mapdata);
		System.out.println("EE Salary details: "+mapdata.get("Salary"));
		
		System.out.println("Records count: "+mapdata.size());
		mapdata.remove("Salary");
		System.out.println("EE record after salary delete : "+mapdata);
	}

}
