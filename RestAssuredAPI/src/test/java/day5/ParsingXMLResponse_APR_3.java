package day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParsingXMLResponse_APR_3 {
	@Test
	public void parsingXMLResponse() {
		
		Response res = given()
		.when()
			.get("https://mocktarget.apigee.net/xml/");
		
		XmlPath xmlobj = new XmlPath(res.asString());
		List<String> citylist = xmlobj.getList("root.city");
		System.out.println(citylist.size());
		int totalcities = citylist.size();
		
		Assert.assertEquals(totalcities, 1);
		
		boolean status = false;
		
		for(String eachcity:citylist) {
			//System.out.println(eachcity);
			if(eachcity.equals("San Jose")) {
				status = true;
				break;
			}
		}
		Assert.assertEquals(status, true);
	}

}
