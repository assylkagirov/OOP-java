package Paint;

public class Rectangle extends Shape{
	int le, wi;
	Rectangle(){
		
	}
	public Rectangle(Color color, int pos) {
		super(pos,color);
	}
	
	void draw(int le) {
		for(int i = 0; i<le;i++) {
			System.out.println("-");
		}
	}
	void draw2(int wi) {
		for(int i = 0; i<wi;i++) {
			System.out.println("|");
		}
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
