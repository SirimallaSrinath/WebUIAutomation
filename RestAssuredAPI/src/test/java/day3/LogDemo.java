package day3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LogDemo {
	@Test
	public void logDemo() {
		given()
		.when()
			.get("https://www.google.com")
		.then()
			//.log().cookies();
			//.log().headers();
			//.log().body();
		.log().all();
		
	}

}
