package com.cucumberprac;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefDataTable {
	
	@Given("User launch url")
	public void user_launch_url() {
	    System.out.println("User launched URL");
	}

	@When("User provides username password credentials")
	public void user_provides_username_password_credentials(DataTable dataTable) {
		
		System.out.println("Table data information"); 
		
//		List<String> listofdata = dataTable.asList();
//		for (String ecdata:listofdata) {
//			System.out.println(ecdata);
//		}
		
	   
	}

	@Then("User login successfully")
	public void user_login_successfully() {
	    System.out.println("User loggedin Successfully");
	}

}
