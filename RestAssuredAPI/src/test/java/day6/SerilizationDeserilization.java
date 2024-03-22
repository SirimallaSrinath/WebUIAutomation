package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import day2.PojoData;

public class SerilizationDeserilization {
	//@Test
	public void convertPojo2Json() throws JsonProcessingException {

		//created java object using pojo class
		PojoData studentpojo = new PojoData();
		studentpojo.setName("SriAnagha");
		studentpojo.setLocation("Dallas");
		studentpojo.setPhone("+41-9866448489");

		String[] stucourse = {"Java","PlayWright"};
		studentpojo.setCourses(stucourse);

		// converting java object to json object
		ObjectMapper objmapper = new ObjectMapper();
		String jsondata = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentpojo);
		System.out.println(jsondata);
	}
	@Test
	public void convertJson2Pojo() throws JsonMappingException, JsonProcessingException {
		
		String jsondata = "{\r\n"
				+ "  \"name\" : \"SriAnagha\",\r\n"
				+ "  \"location\" : \"Dallas\",\r\n"
				+ "  \"phone\" : \"+41-9866448489\",\r\n"
				+ "  \"courses\" : [ \"Java\", \"PlayWright\" ]\r\n"
				+ "}";
		
		ObjectMapper objmap = new ObjectMapper();
		PojoData stupojo = objmap.readValue(jsondata,PojoData.class); //convert json to pojo
		System.out.println(stupojo.getName());
		System.out.println(stupojo.getLocation());
		System.out.println(stupojo.getPhone());
		System.out.println(stupojo.getCourses()[0]);
		System.out.println(stupojo.getCourses()[1]);
		
	}
	

}
