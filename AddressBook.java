

class AddressBook{

public static void main (String[] args){

	Person person = new Person();
        person.setFirstname("abc");
	person.setLastname("pqr");
 	person.setAddress("vidyavihar");
	person.setCity("nashik");
	person.setState("Maharashtra");
	person.setZip("422101");
	person.setPhone("1234567890");
        System.out.println(person.getFirstname());
	System.out.println(person.getLastname());
	System.out.println(person.getAddress());
	System.out.println(person.getCity());
	System.out.println(person.getState());
 	System.out.println(person.getZip());
 	System.out.println(person.getPhone());

}
}



