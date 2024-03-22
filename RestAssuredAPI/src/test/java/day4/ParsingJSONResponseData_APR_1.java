package day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ParsingJSONResponseData_APR_1 {
	@Test
	public void parsingJSONResponse() {
		
		given()
			.contentType("application/json")
		.when()
			.get("http://localhost:3000/book")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json")
			.body("[2].title", equalTo("Jungle Book"));
	}

}
