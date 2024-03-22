package day8;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CreateUser {
	@Test
	public void createUser(ITestContext context) {
		
		Faker faker = new Faker();
		
		JSONObject jo =new JSONObject();
		jo.put("name", faker.name().fullName());
		jo.put("gender", "male");
		jo.put("email",faker.internet().safeEmailAddress());
		jo.put("phone", faker.phoneNumber().cellPhone());
		
		String id_path = given()
			.body(jo.toString())
			
		.when()
			.post("http://localhost:3000/students_details")
			.jsonPath().getString("id");
		
		System.out.println(id_path);
		//context.setAttribute("user_id", id_path);
		context.getSuite().setAttribute("user_id", id_path);
		
	}

}
