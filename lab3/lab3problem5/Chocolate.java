package lab3problem5;

public class Chocolate implements Comparable<Chocolate>{
	
	String name;
	double weight;
	
	public Chocolate() {}
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Chocolate c) {
		if (weight > c.weight)
			return 1;
		else if (weight < c.weight)
			return -1;
		return 0;
	}
	
	public String toString() {
		return "Name: " + name + ", weight: " + weight;
	}
}