package AdvEx1_2Excep;

public class Person {

	// attributes
	private String name;
	private String firstname;
	private int age;
	private String address;
	private City birthCity;
	
	
	//constructors
	public Person(String name, String firstname, int age, String address, City birthCity) {
		this.name = name;
		this.firstname = firstname;
		this.age = age;
		this.address = address;
		this.birthCity = birthCity;
	}
	public Person(String name, String firstname, int age, String address) {
		this.name = name;
		this.firstname = firstname;
		this.age = age;
		this.address = address;
	}
	public Person(String name, String firstname, int age) {
		this.name = name;
		this.firstname = firstname;
		this.age = age;
	}
	public Person(String name, String firstname) {
		this.name = name;
		this.firstname = firstname;
	}
	public void City(String cityName, String country) {
		return;
	}
	
	// Accesseurs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public City getBirthCity() {
		return birthCity;
	}
	public void setBirthCity(City birthCity) {	
		this.birthCity = birthCity;
	}

	
	// Methods
	public void toStringHomeTown() {
		return;
	}

	
	//	ex1.9
//	@Override
//	public String toString() {
//		if(birthCity != null) {
//			return "Person [lastName=" + name + ", firstName=" + firstname + ", age=" + age + ", address=" 
//					+ address + "]" + birthCity.toStringHomeTown();
////		return String.format("Person [lastName = %s, firstName= %s, age= %d", name, firstName, age);
//		} 			return "Person [lastName=" + name + ", firstName=" + firstname + ", age=" + age + ", address=" 
//		+ address + "]"; 
//	}
	
	@Override
	public String toString() {
	    String birthInfo = (birthCity != null) ? " Ville de naissance : " + birthCity.toString() : "";
	    return String.format("Person [lastName=%s, firstName=%s, age=%d, address=%s]%s", 
	                         name, firstname, age, address, birthInfo);
	}
//	}
}
