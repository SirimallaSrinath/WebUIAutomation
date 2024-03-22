package day7;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.auth.AUTH;
import org.testng.annotations.Test;

public class Basic_Digest_Preemptive_Authentication {
	@Test
	public void basicAuthi() {

		given()
			.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
	
	@Test
	public void digestAuth_leafground() {
		
		given()
			.auth().digest("admin", "testleaf")
		.when()
			.get("http://leafground.com:8090/login")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test
	public void preemptiveAuthBasic_testleaf() {
		given()
			.auth().preemptive().basic("admin", "testleaf")
		.when()
			.get("http://leafground.com:8090/login")
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
}
