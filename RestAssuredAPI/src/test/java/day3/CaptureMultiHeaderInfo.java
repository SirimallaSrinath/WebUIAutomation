package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CaptureMultiHeaderInfo {
	@Test
	public void multiHeader() {
		Response res = given()
		.when()
			.get("https://www.google.com");
		
		Headers myheaders = res.getHeaders();
		
		for(Header header:myheaders) {
			System.out.println(header.getName()+" "+header.getValue());
		}
	}

}
