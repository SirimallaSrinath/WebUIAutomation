package practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class RestAssuredAuth {
	@Test(priority=1)
	public void basicAuth() {
		given()
			.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
	@Test(priority=2)
	public void digestAuth() {
		given()
			.auth().digest("admin", "testleaf")
		.when()
			.get("http://leafground.com:8090/login")
		.then()
			.statusCode(200)
			.log().all();
	}
	@Test(priority=3)
	public void preemptiveAuth() {
		given()
			.auth().preemptive().basic("admin", "testleaf")
		.when()
			.get("http://leafground.com:8090/login")
		.then()
			.statusCode(200)
			.log().all();
	}

}
