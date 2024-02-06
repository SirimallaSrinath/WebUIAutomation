package com.sampleprac;

public class MethodConstructor {

	int id;
	String name;
	double salary;

	public MethodConstructor(int empid, String empname, double empsalary) {
		id=empid;
		name = empname;
		salary = empsalary;
	}

	public void m1() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		MethodConstructor obj = new MethodConstructor(111,"PlayWright",25002.07);
		obj.m1();

	}

}
