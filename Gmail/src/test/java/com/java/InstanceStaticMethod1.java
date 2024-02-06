package com.java;

public class InstanceStaticMethod1 {
	
	void m1(int id,String name,double salary) {
		System.out.println("Instance Method");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(id+" "+name+" "+salary);
		
	}

	static void m2(int empid,String empname,double empsalary) {
		System.out.println("Static Method");
		System.out.println(empid+" "+empname+" "+empsalary);
	} 
	
	public static void main(String[] args) {
		InstanceStaticMethod1 ism1 = new InstanceStaticMethod1();
		ism1.m1(111, "SRIRAM", 25521.02);
		InstanceStaticMethod1.m2(222,"Ragav",55012.02);
		
	}
	
}
