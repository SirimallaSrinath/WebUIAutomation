package com.sampleprac;

public class EmpRecord {
	
	public static void main(String[] args) {
		
		EmpTemplate obj = new EmpTemplate();
		obj.setEmpId(101);
		obj.setEmpName("Ratan");
		obj.setEmpSalary(85410.02);
		
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpSalary());
		
		EmpTemplate obj1 = new EmpTemplate();
		obj1.setEmpId(102);
		obj1.setEmpName("Pavan");
		obj1.setEmpSalary(82100.02);
		System.out.println(obj1.getEmpId());
		System.out.println(obj1.getEmpName());
		System.out.println(obj1.getEmpSalary());
	}

}
