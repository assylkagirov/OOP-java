package lab3problem1;

public abstract class Cars {
	
	String model;
	int year;
	
	Cars(){
	}
	
	Cars(String model, int year){
		this.model = model;
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear(){
		return year;
	}
	
	public String toString() {
		return "Model of car: " + this.model + ". Year of car: " + this.year;
	}
	
	abstract void  sound();
}
