package com.sampleprac;

public class EmpTemplate {

	private int empid;
	private String empname;
	private double empsalary;

	void setEmpId(int empid) {
		this.empid = empid;
	}

	void setEmpName(String empname) {
		this.empname = empname;
	}

	void setEmpSalary(double empsalary) {
		this.empsalary = empsalary;
	}

	int getEmpId() {
		return empid;
	}

	String getEmpName() {
		return empname;
	}
	double getEmpSalary() {
		return empsalary;
	}

}
