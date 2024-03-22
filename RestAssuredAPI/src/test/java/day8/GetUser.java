package day8;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class GetUser {
	@Test
	public void getUser(ITestContext context) {
		
		//String id_value = (String) context.getAttribute("user_id");	// This should come from CreateUser request
		
		String id_value = (String) context.getSuite().getAttribute("user_id");
		
		given()
			.pathParam("ID_PATH", id_value)
		.when()
			.get("http://localhost:3000/students_details/{ID_PATH}")
		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}
