package com.java;

public class Encapemprecord {
	
	public static void main(String[] args) {
		
		Encapemptemplate empobj = new Encapemptemplate();
		empobj.setEmpid(101);
		empobj.setEmpname("Ratan");
		empobj.setEmpsalary(85021.03);
		
		System.out.println(empobj.getEmpid());
		System.out.println(empobj.getEmpname());
		System.out.println(empobj.getEmpsalary());
		
		Encapemptemplate empobj1 = new Encapemptemplate();
		empobj1.setEmpid(102);
		empobj1.setEmpname("SRIRAM");
		empobj1.setEmpsalary(125021.07);
		
		System.out.println(empobj1.getEmpid());
		System.out.println(empobj1.getEmpname());
		System.out.println(empobj1.getEmpsalary());
	}

}
