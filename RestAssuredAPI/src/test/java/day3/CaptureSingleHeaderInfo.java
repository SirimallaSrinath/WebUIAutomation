package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CaptureSingleHeaderInfo {
	@Test
	public void singleHeader() {
		Response res = given()
		.when()
			.get("https://www.google.com");
		
		String ctvalue = res.getHeader("Content-Type");
		System.out.println("Content-Type value: "+ctvalue);
	}

}
