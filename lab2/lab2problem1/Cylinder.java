package lab2problem1;

public class Cylinder extends Shape{
	
	private double h;
	private double r;
	
	public Cylinder() {
	}
	
	public Cylinder(double r, double h) {
		this.r = r;
		this.h=h;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r*this.h;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 2*Math.PI *this.r*this.h +2*Math.PI *this.r*this.r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	public String toString() {
		return ("Cylinder: Volume = " + volume() + ", Surface area = " + surfaceArea());
	}
	
}
