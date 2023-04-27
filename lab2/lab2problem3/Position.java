package lab2problem3;

public class Position {
	int px;
	int py;
	char c;
	int num;
	String pos;
	
	public Position() {
	}
	
	public Position(String pos) {
		
		c = pos.charAt(0);
		num = 0;
		if(c == 'A') {
			num  =1;
		}else if(c == 'B') {
			num = 2;
		}else if(c == 'C') {
			num = 3;
		}else if(c == 'D') {
			num = 4;
		}else if(c == 'E') {
			num = 5;
		}else if(c == 'F') {
			num = 6;
		}else if(c == 'G') {
			num = 7;
		}else if(c == 'H') {
			num = 8;
		}
		
		this.px = num;
		this.py = Character.getNumericValue(pos.charAt(1));
	
	}
	
	public boolean outOfBorder() {
		if (px < 1 || px > 8) {
			return true;
		}else if (py < 1 || py > 8) {
			return true;
		}
		return false;
	}
	
	
	
}