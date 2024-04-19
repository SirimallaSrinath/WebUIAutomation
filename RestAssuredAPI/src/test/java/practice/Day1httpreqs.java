package practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Day1httpreqs {
	
	int id;
	
	@Test(priority=1)
	public void getUsersList() {
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();	
	}
	
	@Test(priority=2)
	public void createUser() {
		HashMap data = new HashMap();
		data.put("email","pavan.kalyan@reqres.in");
		data.put("first_name", "Pavan");
		data.put("last_name", "Kalyan");
		
		id=given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
	}
	
	@Test(priority=3,dependsOnMethods = "createUser")
	public void updateUser() {
		HashMap data1 = new HashMap();
		data1.put("email","Jack.fields@reqres.in");
		data1.put("first_name", "Jack");
		data1.put("last_name", "Jack");
		
		given()
			.contentType("application/json")
			.body(data1)
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
