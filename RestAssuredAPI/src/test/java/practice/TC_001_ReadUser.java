package practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TC_001_ReadUser {
	
	@Test
	public void readUser(ITestContext context) {
		
		String id_path = (String) context.getAttribute("userid");
		
		given()
			
		.when()
			.get("http://localhost:3000/students_details/"+id_path)
		.then()
			.log().all();
	}

}
