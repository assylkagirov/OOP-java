package lab3problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Object>, Cloneable {
	
	private Vector<Employee> team = new Vector<Employee>();
	private double bonus;
	
	public Manager () {
	}
	public Manager (String name, double salary, Date datehire, String numins) {
		super(name, salary, datehire, numins);
	}
	
	public double getBonus() {
		return bonus;
	}
	public void addBonus(double bonus) {
		this.bonus += bonus; 
	}
	
	public void addEmptoTe(Employee w) {
		team.add(w);
	}
	
	public void getTeam() {
		for (Employee i: team) {
			System.out.println(i);
		}
	}
	
	public void removeEmpfromTe(Employee w) {
		team.remove(w);
	}
	
	public String toString() {
		return super.toString() + ". Bonus is " + this.getBonus();
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)){
			return false;
		}
		Manager other = (Manager)o; 
		return (bonus == other.bonus);
	}
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Manager o = (Manager) obj;
		if(super.compareTo(o) ==0) {
			if(bonus > o.bonus) {
				return 1;
			}else if(bonus < o.bonus) {
				return -1;
			}
			return 0;
		}
		return super.compareTo(o);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager c = (Manager) super.clone();
		c.team = extracted();
		return c;
	}

	@SuppressWarnings("unchecked")
	public Vector<Employee> extracted() {
		return (Vector<Employee>) team.clone();
	}
	
}
