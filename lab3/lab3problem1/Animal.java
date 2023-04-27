package lab3problem1;

public class Animal implements Movable {
	
	String name;
	
	public Animal() {
	}
	
	public Animal(String name) {
		this.name = name;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Animal moviiing");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name;
	}

}
