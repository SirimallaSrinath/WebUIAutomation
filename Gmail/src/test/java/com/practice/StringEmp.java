package com.practice;

public class StringEmp{

	int empid;
	String empname;

	StringEmp(int empid,String empname){
		this.empid = empid;
		this.empname = empname;
	}

	public static void main(String[] args) {

		StringEmp e1 = new StringEmp(111,"Ratan");
		StringEmp e2 = new StringEmp(222,"DurgaSoft");
		System.out.println(e1.empid +" "+e1.empname);

		System.out.println(e2);



	}

}
