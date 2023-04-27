package lab1task4;

public class Course {
	
	public String name;
	public String description;
	public int credit;
	public String prereq;
	
	Course(String name, String description){
		this.name = name;
		this.description = description;
	}
	Course(String name, String description, int credit, String prereq){
		this(name,description);
		this.credit = credit;
		this.prereq=prereq;
	}
	public String toString() {
		return this.description + " " + this.name + ". " + credit + " credits."  + " Prerequisite "+ this.prereq;
	}
}