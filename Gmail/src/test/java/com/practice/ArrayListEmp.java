package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ArrayListEmp {

	public static void main(String[] args) {
		ArrayList<EmpList> obj = new ArrayList<EmpList>();

		/*obj.add(new EmpList(121,"Ratan"));
		obj.add(new EmpList(133,"John"));
		obj.add(new EmpList(145,"Pavan"));*/

		EmpList obj1 = new EmpList(121,"Ratan");
		EmpList obj2 = new EmpList(133,"John");
		EmpList obj3 = new EmpList(145,"Pavan");

		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);

		for(EmpList each:obj) {
			System.out.println(each.empid+" "+each.empname);
		}
		
		LinkedList<String> linkedobj = new LinkedList<String>();
		linkedobj.add("Alight");
		linkedobj.add("AON Hewitt");
		linkedobj.add("AON");
		linkedobj.add("AON");
		linkedobj.add("Wipro");
		linkedobj.add(1, "Business Deal");
		System.out.println("LinkedList data: "+linkedobj);
		
		Set<String> hashobj = new HashSet<String>(linkedobj);
		System.out.println("Hashmap data: "+hashobj);
		
		
		ArrayList<String> objar = new ArrayList<String>();
		objar.add("PAVAN");
		objar.add("Kalyan");
		objar.add(1, "Konidala");
		System.out.println(objar);
		}
	
	
}


