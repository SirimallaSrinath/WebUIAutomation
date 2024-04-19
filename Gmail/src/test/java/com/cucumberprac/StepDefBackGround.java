package com.cucumberprac;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefBackGround {
	
	@Given("User login to the Portal")
	public void user_login_to_the_portal() {
	   System.out.println("User login to the Portal"); 
	}

	@When("Added Employee details")
	public void added_employee_details() {
	    System.out.println("Added Employee details");
	}

	
	public void user_logout() {
	    System.out.println("User logout");
	}

	@When("Edited Employee details")
	public void edited_employee_details() {
	   System.out.println("Edited Employee details");
	}

	@When("Deleted Employee details")
	public void deleted_employee_details() {
	   System.out.println("Deleted Employee details");
	}


}
