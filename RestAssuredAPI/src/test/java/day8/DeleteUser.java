package day8;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
	@Test
	public void deleteUser(ITestContext context) {
		
		//String id_value = (String) context.getAttribute("user_id");
		
		String id_value = (String) context.getSuite().getAttribute("user_id");
		
		given()
			.pathParam("Id_path", id_value)
		.when()
			.delete("http://localhost:3000/students_details/{Id_path}")
		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}
