package Paint;

public class Triangle extends Shape {
	public Triangle(Color color, int pos) {
		super(pos,color);
	}
	@Override
	void draw() {
		System.out.println("/\\") ;
		
	}
	
	
}
