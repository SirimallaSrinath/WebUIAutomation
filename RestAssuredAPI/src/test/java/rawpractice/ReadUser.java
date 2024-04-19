package rawpractice;

import static io.restassured.RestAssured.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class ReadUser {
	@Test
	public void readData(ITestContext context) {
		
		String id = (String) context.getSuite().getAttribute("user_id");
		
		
		given()
		.when()
			.get("http://localhost:3000/students_details/"+id)
		.then()
			.log().all();
		

	}

}
