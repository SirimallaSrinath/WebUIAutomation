package com.testng.prac;

import org.testng.annotations.Test;

public class GroupsAnnotation {
	
	@Test(groups = "Sanity")
	public void m1() {
		System.out.println("Sanity Testing");	
	}
	
	@Test(groups="Integration")
	public void m2() {
		System.out.println("Integration Testing");
	}
	
	@Test(groups="Regression")
	public void m3() {
		System.out.println("Regression Testing");
	}
	
	@Test(groups="Sanity")
	public void m4() {
		System.out.println("Sanity Testing");
	}

}
