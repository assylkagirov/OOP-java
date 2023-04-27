package lab2problem1;

public class Sphere extends Shape {
	
	private double Radius;
	
	public Sphere( double Radius) {
		this.Radius = Radius;
	}
	
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double Radius){
		this.Radius = Radius;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4 / 3 * Math.PI * Math.pow(Radius, 2);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(Radius, 2);
	}
	
	public String toString() {
		return("Sphere: Volume = " + volume() + ", Surphace Area = " + surfaceArea());
	}

}
