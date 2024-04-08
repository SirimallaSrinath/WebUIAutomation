package practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class StudentData {
	@Test
	public void studentData() {
		
		given()
		.when()
			.get("http://localhost:3000/students")
		.then()
			.statusCode(200)
			.log().all();
	}

}
