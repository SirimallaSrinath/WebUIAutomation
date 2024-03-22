package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class CaptureMultiCookiesInfo {
	
	@Test
	public void captureMultiCookiesInfo() {
		
		Response res=given()
		.when()
			.get("https://www.google.com/");
		
		Map<String,String> cookies = res.getCookies();
		Set<String> keys = cookies.keySet();
		
		for(String key:keys) {
			
			String cookievalue = res.getCookie(key);
			System.out.println(key+" value : "+cookievalue);
			
		}
		
		
	}

}
