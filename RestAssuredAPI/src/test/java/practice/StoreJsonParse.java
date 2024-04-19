package practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StoreJsonParse {
	
	double totalprice;
	
	@Test
	public void parseJsonData() {
		Response res = given()
		.when()
			.get("http://localhost:3000/store");
		JSONObject jo = new JSONObject(res.asString());
		for(int i=0;i<jo.getJSONArray("book").length();i++) {
			String eachbooktitle = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			System.out.println(eachbooktitle);
			if(eachbooktitle.equalsIgnoreCase("Jungle Book")) {
				String jbauthor = jo.getJSONArray("book").getJSONObject(i).get("author").toString();
				System.out.println("Jungle book author : "+jbauthor);
				break;
			}
		}
		
		for(int i=0;i<jo.getJSONArray("book").length();i++) {
			String ecprice = jo.getJSONArray("book").getJSONObject(i).get("price").toString();
			double ecpriced = Double.parseDouble(ecprice);
			totalprice = totalprice+ecpriced;
		}
		System.out.println("Total price value is : "+totalprice);
		Assert.assertEquals(totalprice, 525.55);
	}

}
