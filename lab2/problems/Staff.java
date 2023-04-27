package problems;

public class Staff extends Person{
	private String school;
	private double pay;
	
	Staff(){
		
	}
	
	Staff(String name){
		super(name);
	}
	
	Staff(String name, String address){
		super(name, address);
	}
	
	Staff(String name, String address, String school){
		super(name, address);
		this.school = school;
	}
	
	Staff(String name, String address, String school, double pay){
		super(name, address);
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String newSchool) {
		school = newSchool;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double newPay) {
		pay = newPay;
	}
	
	public String toString() {
		return "Name: " + super.getName() + " ,Address: " + super.getAddress() + " ,School: " + school + " ,Pay: " + pay;
	}
}
