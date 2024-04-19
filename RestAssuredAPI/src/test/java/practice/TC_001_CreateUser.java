package practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class TC_001_CreateUser {
	
	String id_path;
	@Test
	public void createUser(ITestContext context) {
		
		Faker faker = new Faker();
		JSONObject obj = new JSONObject();
		obj.put("name", faker.name().fullName());
		obj.put("gender", "male");
		obj.put("email", faker.internet().safeEmailAddress());
		obj.put("phone", faker.phoneNumber().cellPhone());
		obj.put("status", "In Active");
		
		Response res = given()
			.contentType("application/json")
			.body(obj.toString())
		.when()
			.post("http://localhost:3000/students_details");
		
		id_path = res.jsonPath().getString("id");
		System.out.println(id_path);
		
		context.setAttribute("userid", id_path);
		//context.getSuite().setAttribute("userid", id_path);
		
	}

}
