package practice;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import day2.PojoData;

public class Serialization {
	@Test(priority=1)
	public void javaobj2json() throws JsonProcessingException {
		PojoData jobj = new PojoData();
		jobj.setName("Pavan");
		jobj.setPhone("9866448489");
		jobj.setLocation("Hyderabad");
		String[] courses = {"java","python"};
		jobj.setCourses(courses);
		
		//convert java object to json object
		
		ObjectMapper om = new ObjectMapper();
		String jsonobj = om.writerWithDefaultPrettyPrinter().writeValueAsString(jobj);
		System.out.println(jsonobj);
		
	}
	
	@Test(priority=2)
	public void jsonobjjava() throws JsonMappingException, JsonProcessingException {
		
		String jsondata = "{\r\n"
				+ "  \"name\" : \"Pavan\",\r\n"
				+ "  \"location\" : \"Hyderabad\",\r\n"
				+ "  \"phone\" : \"9866448489\",\r\n"
				+ "  \"courses\" : [ \"java\", \"python\" ]\r\n"
				+ "}";
		
		ObjectMapper objmap = new ObjectMapper();
		PojoData pojoobj = objmap.readValue(jsondata, PojoData.class);
		System.out.println(pojoobj.getName());
		System.out.println(pojoobj.getPhone());
		System.out.println(pojoobj.getLocation());
		System.out.println(pojoobj.getCourses()[0]);
		System.out.println(pojoobj.getCourses()[1]);
		
	}

}
