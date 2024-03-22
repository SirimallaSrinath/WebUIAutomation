package day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class MultiPostReqBodyJsonLib {
	
	@Test
	public void createStudentJsonLibrary() {
		
		JSONObject data = new JSONObject();
		data.put("name", "Srivani");
		data.put("location", "Hyderabad");
		data.put("phone", "9866448489");
		
		String[] coursesarray = {"Politics","Economy"};
		data.put("courses", coursesarray);
		
		given()
			.contentType("application/json")
			.body(data.toString())
		.when()
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}

}
