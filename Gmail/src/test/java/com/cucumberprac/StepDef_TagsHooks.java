package com.cucumberprac;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class StepDef_TagsHooks {
	@Before("@June2024")
	public void preReq() {
		System.out.println("Pre-Conditions");
	}
	
	@When("m1 method")
	public void m1_method() {
		System.out.println("m1 method");  
	}

	@When("m2 method")
	public void m2_method() {
		System.out.println("m2 method");
	}

	@When("m3 method")
	public void m3_method() {
	    System.out.println("m3 method");
	}
	
	@After("@June2024")
	public void postReq() {
		System.out.println("Post-Conditions");
	}

}
