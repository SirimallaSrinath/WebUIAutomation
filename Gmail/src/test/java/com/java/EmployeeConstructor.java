package com.java;

public class EmployeeConstructor {

	int empid;
	String empname;
	double empsalary;

	EmployeeConstructor(int empid,String empname,double empsalary){
		this.empid = empid;
		this.empname= empname;
		this.empsalary = empsalary;
	}

	void empdata(){
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
	}
	
	public static void main(String[] args) {
		
		EmployeeConstructor ec = new EmployeeConstructor(111,"Ratan",85000.52);
		ec.empdata();
		EmployeeConstructor ec1 = new EmployeeConstructor(222, "Jai", 9500.25);
		ec1.empdata();
	}
	
	
}
