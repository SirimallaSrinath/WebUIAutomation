package api.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.ExcelHelper;
import io.restassured.response.Response;

public class DataDriven {
	
	@Test(priority=1,dataProvider = "ExcelTestData")
	public void testPostUser(String UI,String UN,String FN,String LN,String Email,String Pwd,String Phn) {
		
		User userPayload = new User();
		userPayload.setId(Integer.parseInt(UI));
		userPayload.setUsername(UN);
		userPayload.setFirstName(FN);
		userPayload.setLastName(LN);
		userPayload.setEmail(Email);
		userPayload.setPassword(Pwd);
		userPayload.setPhone(Phn);
		
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2,dataProvider = "UserNameData")
	public void testReadUser(String userName) {
		Response response = UserEndPoints.readUser(userName);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);	
	}
	
	@Test(priority=3,dataProvider="UserNameData")
	public void testDeleteUser(String userName) {
		Response response = UserEndPoints.deleteUser(userName);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@DataProvider(name = "ExcelTestData")
	public String[][] getTestData() throws Exception {
		return ExcelHelper.getTestData("C:\\Automation Workspace\\PetStoreAutomation\\testdata\\testdata.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "UserNameData")
	public String[][] getUserTestData() throws Exception {
		return ExcelHelper.getTestData("C:\\Automation Workspace\\PetStoreAutomation\\testdata\\username.xlsx", "Sheet1");
	}
	
	
}
