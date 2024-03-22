package day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	@Test
	public void testGenerateDummyData() {
		Faker faker = new Faker();
		String fullName = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		
		String userName = faker.name().username();
		String password = faker.internet().password();
		String phone = faker.phoneNumber().cellPhone();
		String email = faker.internet().safeEmailAddress();
		
		System.out.println("Fullname : "+fullName);
		System.out.println("Firstname : "+firstName);
		System.out.println("Lastname : "+lastName);
		System.out.println("Username : "+userName);
		System.out.println("Password : "+password);
		System.out.println("Phone : "+phone);
		System.out.println("Email : "+email);
		
	}

}
