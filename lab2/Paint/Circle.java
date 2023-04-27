package Paint;

public class Circle extends Shape {
	
	
	public Circle(Color color, int pos) {
		super(pos,color);
	}

	Circle(){
		
	}
	
	@Override
	void draw() {
		System.out.println(" ".repeat(pos));
		System.err.println("O");
	}
	
	
}
