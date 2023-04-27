package Paint;

import java.util.Vector;

public class test {
	
	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		
		shapes.add(new Circle(Color.Red, 4));
		for(Shape s: shapes) {
			s.draw();
		}
	}
	
	
}
