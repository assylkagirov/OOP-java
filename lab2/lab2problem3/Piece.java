package lab2problem3;

public abstract class Piece {
	
	public Piece() {
	}
		
	Position p1;
	
	public static boolean isLegalMove(Position p1, Position p2) {
		if (p1.equals(p2)) {
			return false;
		}else if (p1.outOfBorder() || p2.outOfBorder()) {
			return false;
		}
		return true;
	}
	
}
