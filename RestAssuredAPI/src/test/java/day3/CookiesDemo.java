package day3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CookiesDemo {
	@Test
	public void cookiesDemo() {
		
		given()
		.when()
			.get("https://www.google.com/")
		.then()
			.cookie("AEC","Ae3NU9M-bx9y0bosH0hhdgcO5AkOD9DdjrZiJA2wokKJjE9RS2QvFhMQ9w")
			.log().all();
	}

}

/* 
 * FAILED: day3.CookiesDemo.cookiesDemo java.lang.AssertionError: 1 expectation
 * failed. Expected cookie "AEC" was not
 * "Ae3NU9M-bx9y0bosH0hhdgcO5AkOD9DdjrZiJA2wokKJjE9RS2QvFhMQ9w", was
 * "Ae3NU9M5ml9XvuxZLukGcgYiMWizbDzuNIaaIuJhhVliMZ_Z3wMmz7Q3OA".
 */