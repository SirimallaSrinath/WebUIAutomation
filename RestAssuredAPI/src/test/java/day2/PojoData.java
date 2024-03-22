package day2;

public class PojoData {
	
	String name;
	String location;
	String phone;
	String[] courses;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return courses;
	}
}
