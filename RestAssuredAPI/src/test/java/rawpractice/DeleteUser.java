package rawpractice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
	
	@Test
	public void deleteUser(ITestContext context) {
		
		String id = (String) context.getSuite().getAttribute("user_id");
		given()
			.pathParam("studsrec", "students_details")
			.pathParam("id_stu",id)
		.when()
			.delete("http://localhost:3000/{studsrec}/{id_stu}")
		.then()
			.log().all();
		
		
	}

}
