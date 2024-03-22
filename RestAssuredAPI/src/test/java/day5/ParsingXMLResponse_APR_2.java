package day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ParsingXMLResponse_APR_2 {
	@Test
	public void parsingXMLResp() {
		
		Response res = given()
		.when()
			.get("https://mocktarget.apigee.net/xml/");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
		String firstname = res.xmlPath().get("root.firstName").toString();
		//System.out.println(firstname);
		Assert.assertEquals(firstname, "John");
		
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
	}

}
