package practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class AlightApis {
	@Test(priority=1)
	public void alightAPIs() {
		
		given()
		.when()
			.get("https://geolocation.onetrust.com/cookieconsentpub/v1/geo/location/")
		.then()
			.statusCode(200)
			.log().body();
	}
	@Test(priority=2)
	public void alightengjson() {
		given()
		.when()
			.get("https://alightsolutions.widget.insent.ai/english.json")
		.then()
			.log().body()
			.body("TextMessageSending", equalTo("Sending ..."));
	}
	

}
