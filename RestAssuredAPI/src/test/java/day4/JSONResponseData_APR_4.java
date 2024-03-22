package day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class JSONResponseData_APR_4 {
	@Test
	public void jsonResponseData() {
		double apv_double = 0;
		Response res =given()
		.when()
			.get("http://localhost:3000/store");
		
		JSONObject jo = new JSONObject(res.asString());
		for(int i=0;i<jo.getJSONArray("book").length();i++) {
			String epv_string = jo.getJSONArray("book").getJSONObject(i).get("price").toString();
			
			double epv_double = Double.parseDouble(epv_string);
			apv_double = apv_double+epv_double;
		}
		System.out.println("Total price for all books is :"+apv_double);
		Assert.assertEquals(apv_double, 525.55);
	}

}
