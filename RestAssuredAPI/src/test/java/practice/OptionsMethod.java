package practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class OptionsMethod {
	@Test
	public void optionsMethod() {
		given()
		
		.when()
			.options("https://reqres.in/api/users?page=2")
		.then()
			.log().all();
	}

}
