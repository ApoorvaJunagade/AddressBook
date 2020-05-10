import java.util.Scanner;
public class Person{
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;

	public String getFirstname(){
		return firstname;
	}
	public String getLastname(){
        	return lastname;
	}
	public String getAddress(){
        	return address;
	}
	public String getCity(){
        	return city;
	}
	public String getState(){
        	return state;
	}
	public String getZip(){
        	return zip;
	}
	public String getPhone(){
        	return phoneNo;
	}
	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}
	public void setLastname(String lastName) {
    		this.lastname = lastName;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setZip(String zip){
		this.zip = zip;
	}
	public void setPhone(String phoneNo){
		this.phoneNo = phoneNo;
	}

}


