package problems;

public class Student extends Person{
	public String program;
	public int year;
	public double fee;
	
	Student(){
		
	}
	
	Student(String name){
		super(name);
	}
	
	Student(String name, String address){
		super(name, address);
	}
	
	Student(String name, String address, String program){
		super(name, address);
		this.program = program;
	}
	
	Student(String name, String address, String program, int year){
		super(name, address);
		this.year = year;
	}
	
	Student(String name, String address, String program, int year, double fee){
		super(name, address);		
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String newProgram) {
		program = newProgram;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(double newFee) {
		fee = newFee;
	}
	
	public String toString() {
		return "Name: " + super.getName() + " ,Address: " + super.getAddress() + " ,Program: " + program + " ,Year: " + year + " ,Fee: " + fee;
	}
	
}
