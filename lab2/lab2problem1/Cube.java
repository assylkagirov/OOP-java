package lab2problem1;

public class Cube extends Shape{
	
	private Double side;
	
	public Cube(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(this.side, 3);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 6*Math.pow(this.side, 2);
	}
	
	public String toString() {
		return ("Cube: Volume = " + volume() + ", Surface area = " + surfaceArea());
	}
	

}
