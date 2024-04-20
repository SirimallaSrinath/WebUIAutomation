package rawpractice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class CreateUser {
	
	
	@Test()
	public void createUser(ITestContext context) {
		
		Faker faker = new Faker();
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("name", faker.name().name());
		jsonobj.put("gender", "M");
		jsonobj.put("email", faker.internet().safeEmailAddress());
		jsonobj.put("phone",faker.phoneNumber().cellPhone());
		jsonobj.put("status", "InActive");
		
		Response res = given()
			.contentType("application/json")
			.body(jsonobj.toString())
		.when()
			.post("http://localhost:3000/students_details");
			String id = res.jsonPath().getString("id");
			res.then().log().all();
			System.out.println("Id value is "+id);
			context.getSuite().setAttribute("user_id", id);
	}

}
