package problems;

public class Person {
	private String name;
	private String address;

	Person(){
	
	}
	
	Person(String name){
		this.name = name;
	}
	
	Person (String name, String address){
		this(name);
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public String toString() {
		return "Name: " + name + " Address: " + address;
	}
}
