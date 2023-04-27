package lab2problem3;

public class Pawn extends Piece{

	public Pawn() {
	}
	public Pawn(Position p1) {
		this.p1 = p1;
	}
	
	public boolean isLegalMove(Position p2) {
		// TODO Auto-generated method stub
		return isLegalMove(this.p1 , p2);
	}
	
	public static boolean isLegalMove(Position p1, Position p2) {
		if(!Piece.isLegalMove(p1, p2)) {
			return false;
		}else if ((Math.abs(p1.px - p1.px) <= 1) && (p1.py < p2.py) && (p1.py > 1)) {
			if (p1.px == p2.px && (p2.py - p1.py == 2) && p1.py == 2) {
				return true;
			}
		}
			else if (p2.py - p1.py == 1) {
				return true;
			}
		return false;
	}
				
		
}