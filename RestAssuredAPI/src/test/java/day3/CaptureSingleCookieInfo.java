package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CaptureSingleCookieInfo {
	@Test
	public void captureSingleCookieInfo() {
		
		Response res=given()
		.when()
			.get("https://www.google.com/");
		
		String cookie_value = res.getCookie("AEC");
		System.out.println("Cookie AEC value is: "+cookie_value);
		
	}

}
