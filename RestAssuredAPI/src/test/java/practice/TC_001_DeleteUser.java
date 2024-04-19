package practice;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_001_DeleteUser {
	@Test
	public void deleteUser(ITestContext context) {
		String id_path = (String) context.getAttribute("userid");
		
		given()
			
		.when()
			.delete("http://localhost:3000/students_details/"+id_path)
		.then()
			.log().all();
	}

}
