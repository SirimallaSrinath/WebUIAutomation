package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequests {
	
	int id;
	
	@Test(priority = 1)
	public void getUsers() {
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page",equalTo(2)) // RestAssured Assertion
			.log().all();
	}
	
	@Test(priority=2)
	public void createUser() {
		
		HashMap data = new HashMap();
		data.put("name","Srinath");
		data.put("job", "IT Employee");
		
		id=given()
			.contentType("Application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		/*.then()
			.statusCode(201)
			.log().all();*/
	}
	
	@Test(priority=3,dependsOnMethods = {"createUser"})
	public void updateUser() {
		HashMap data = new HashMap();
		data.put("name", "SriAnagha");
		data.put("job", "Doctor");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.put("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority=4)
	public void deleteUser() {
		given()
		
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(204)
			.log().all();
	}
	
}
