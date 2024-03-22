package day8;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UpdateUser {
	@Test
	public void update_User(ITestContext context) {
		Faker faker = new Faker();
		JSONObject jo = new JSONObject();
		
		jo.put("name", faker.name().fullName());
		jo.put("gender", "FEMALE");
		jo.put("email", faker.internet().safeEmailAddress());
		jo.put("phone", faker.phoneNumber().cellPhone());
		
		//String id_value = (String) context.getAttribute("user_id");
		
		String id_value = (String) context.getSuite().getAttribute("user_id");
		
		given()
			.body(jo.toString())
			.pathParam("Id_path", id_value)
		.when()
			.put("http://localhost:3000/students_details/{Id_path}")
		.then()
			.log().all();
	}

}
