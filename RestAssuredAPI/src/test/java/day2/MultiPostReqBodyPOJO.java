package day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class MultiPostReqBodyPOJO {
	
	@Test
	public void postReqBodyPojo() {
		
		PojoData data = new PojoData();
		data.setName("Srilatha");
		data.setLocation("Kukatpally");
		data.setPhone("9866448488");
		String[] coursesarray = {"ANAESTHETIST","ENT"};
		data.setCourses(coursesarray);
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.log().all();
	}

}
