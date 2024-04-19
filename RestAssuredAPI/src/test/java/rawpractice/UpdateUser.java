package rawpractice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {
	@Test
	public void updateUser(ITestContext context) {
		String id = (String) context.getSuite().getAttribute("user_id");
		
		Faker faker = new Faker();
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("name", faker.name().name());
		jsonobj.put("gender", "F");
		jsonobj.put("email", faker.internet().safeEmailAddress());
		jsonobj.put("phone",faker.phoneNumber().cellPhone());
		jsonobj.put("status", "Active");
		
		given()
			.contentType("application/json")
			.body(jsonobj.toString())
		.when()
			.put("http://localhost:3000/students_details/"+id)
		.then()
			.log().all();
	}

}
