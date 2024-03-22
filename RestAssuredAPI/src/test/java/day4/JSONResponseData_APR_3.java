package day4;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JSONResponseData_APR_3 {
	//@Test
	public void jsonResponseData() {
		Response res = given()

				.when()
				.get("http://localhost:3000/store");

		JSONObject jo =new JSONObject(res.asString());

		for(int i=0;i<jo.getJSONArray("book").length();i++) {

			String bookTitle = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			System.out.println("Book Title : "+bookTitle);

			if(bookTitle.equals("Sword of Honour")) { 
				String SOHauthor = jo.getJSONArray("book").getJSONObject(i).get("author").toString();
				System.out.println("SOH author name : "+SOHauthor); 
				break; 
			}
		}
	}

	@Test
	public void JSONResData() {
		Response res = given()
		.when()
			.get("http://localhost:3000/store");
		JSONObject jod = new JSONObject(res.asString());
		for(int i=0;i<jod.getJSONArray("book").length();i++) {
			String eachauthorname = jod.getJSONArray("book").getJSONObject(i).get("author").toString();
			//System.out.println(eachauthorname);
			if(eachauthorname.equals("RR Toliken")) {
				String RRT_title = jod.getJSONArray("book").getJSONObject(i).get("title").toString();
				System.out.println("RRT book title : "+RRT_title);
				break;
			}
			
		}
		
		

	}
}
