package practice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class TC_001_UpdateUser {
	
	
	@Test
	public void updateUser(ITestContext context) {
		
		String id_path = (String) context.getAttribute("userid");
		
		Faker faker = new Faker();
		JSONObject obj = new JSONObject();
		obj.put("name", faker.name().fullName());
		obj.put("gender", "female");
		obj.put("email", faker.internet().safeEmailAddress());
		obj.put("phone", faker.phoneNumber().cellPhone());
		obj.put("status", "Active");
		
		given()
			.contentType("application/json")
			.body(obj.toString())
		.when()
			.put("http://localhost:3000/students_details/"+id_path)
		.then()
			.log().all();
	}

}
