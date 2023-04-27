package lab3problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Object>, Cloneable{
	
	private double salary;
	private Date datehire;
	private String numins;
	
	public Employee() {
	}
	public Employee(String name, double salary, Date datehire, String numins ){
		super(name);
		this.salary = salary;
		this.datehire = datehire;
		this.numins =numins;
	}
	public Date getDatehire() {
		// TODO Auto-generated method stub
		return datehire;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getNumins() {
		return numins;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) {
			return false;
		}
		Employee e = (Employee)o;
		return(salary == e.salary) && (datehire.equals(e.datehire)) && (numins.equals(e.numins));
	}
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Employee o = (Employee) obj;
		if(salary > o.salary) {
			return 1;
		}else if(salary < o.salary) {
			return -1;
		}
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
	
	public String toString() {
		return "Name of employee is " + super.getName() + ". Salary is " + this.getSalary() + " Hire date is " + this.getDatehire() + ". Insurance number is " + this.getNumins();
		}

	
}
