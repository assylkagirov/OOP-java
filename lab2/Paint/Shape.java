package Paint;

import java.util.Vector;

public abstract class Shape {

	Color color;
	int pos;
	
	Shape(){
		
	}
	Shape(int pos){
		this.pos = pos;
	}
	Shape(int pos, Color color){
		this(pos);
		this.color = color;
	}
	abstract void draw();
	
	
	
	
}
