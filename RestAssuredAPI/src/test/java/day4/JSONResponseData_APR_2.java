package day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class JSONResponseData_APR_2 {
	@Test
	public void jsonResponseData() {
		Response res=given()
			.contentType("application/json")
		.when()
			.get("http://localhost:3000/book");
		
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/json");
		
		String author_element_3 = res.jsonPath().get("[2].author").toString();
		Assert.assertEquals(author_element_3, "Herman Melville");
		
	}

}
