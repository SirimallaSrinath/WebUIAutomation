package com.java;

public class InstanceStaticMethod2 {

	int empid;
	String empname;
	double empsalary;

	void m1(int empid,String empname,double empsalary) {
		this.m2(10, 20);
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
	}

	void m2(int i,int j) {
		System.out.println("Two Argument Instance Method");
	}
	
	public static void main(String[] args) {
		InstanceStaticMethod2 ism2 = new InstanceStaticMethod2();
		ism2.m1(111, "Jagan", 88254.02);

	}

}
