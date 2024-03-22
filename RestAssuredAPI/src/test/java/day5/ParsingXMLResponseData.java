package day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ParsingXMLResponseData {
	@Test
	public void parsingXMLResponse() {
		given()

		.when()
			.get("https://mocktarget.apigee.net/xml/")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/xml; charset=utf-8")
			.body("root.city",equalTo("San Jose"));
	}

}
