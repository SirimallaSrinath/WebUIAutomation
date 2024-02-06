package com.practice;

public class Interface1class implements Interface1{

	int i ;
	int j ;
	String emp;

	public String m1(int i, int j) {

		this.i = i;
		this.j = j;
		return null;
	}

	public int m2(String emp) {
		this.emp = emp;
		return 0;
	}

	public int getm1i() {
		return i;
	}

	public int getm1j() {
		return j;
	}

	public String getemp() {
		return emp;
	}

	public static void main(String[] args) {
		Interface1class obj = new Interface1class();
		obj.m1(100, 200);
		obj.m2("Jagan");
		System.out.println(obj.getm1i()+obj.getm1j());
		System.out.println(obj.getemp());

	}

}
