package objectComplexity;

public class SchooltMain {
	public static void main(String[] args) {
		
		Student std = new Student();
		std.setFirstName("Riya");
		std.setLastName("salvi");
		std.setEmail("riya@gmail.com");
		std.setMobile("8989898989");
		std.setYear("last year");
		std.setBranch("Computer");
		
		std.getAdress().setStreet2("Balaji Nagar");
		std.getAdress().setStreet1("Dhankawadi");
		std.getAdress().setCity("Pune");
		std.getAdress().setCountry("Maharashtra");
		std.getAdress().setState("India");
		std.getAdress().setPinCode("411043");
		
		System.out.println(std);
	}

}