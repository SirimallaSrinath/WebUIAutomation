package day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class MultiPostReqBodyHashMap {
	
	int id;
	@Test(priority=1)
	public void createStudentHashMap() {
		HashMap data = new HashMap();
		data.put("name", "Gokul");
		data.put("location", "Chicago");
		data.put("phone", "+889587945");
		String[] coursesarray = {"C#","TypeScript"};
		data.put("courses",coursesarray);
		
		
		id=given()
			.contentType("application/json")
			.body(data)	
		.when()
			.post("http://localhost:3000/students")
			.jsonPath().getInt("id");
		/*.then()
			.statusCode(201)
			.body("name", equalTo("Mamatha"))
			.body("location", equalTo("Australia"))
			.header("content-type", "application/json")
			.log().all();*/
	}
	
	//@Test
	public void updateStudentHashMap() {
		HashMap data = new HashMap();
		data.put("name", "SriAnish");
		data.put("location", "France");
		data.put("phone", "+546589589");
		String[] coursesarray = {"Python","PlayWright"};
		data.put("courses",coursesarray);
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.put("http://localhost:3000/students/3039")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	
	
	//@Test
	public void deleteStudentHashMap() {
		given()
		.when()
			.delete("http://localhost:3000/students/6464")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority=2)
	public void deleteStudentGokul() {
		given()
		.when()
			.delete("http://localhost:3000/students/"+id)
		.then()
			.log().all();
	}
	
	
}
