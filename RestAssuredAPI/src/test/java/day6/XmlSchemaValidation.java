package day6;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

public class XmlSchemaValidation {
	@Test
	public void xmlSchemaValidation() {
		
		given()
		.when()
			.get("https://mocktarget.apigee.net/xml")
		.then()
			.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("addressXmlSchema.xsd"));
		
	}

}
