package lab2problem3;

public class Rook extends Piece{
	public Rook() {
	}
	public Rook(Position p1) {
		this.p1 = p1;
	}

	public boolean isLegalMove(Position p2) {
		// TODO Auto-generated method stub
		return isLegalMove(this.p1, p2);
	}
	
	public static boolean isLegalMove(Position p1, Position p2) {
		if(!Piece.isLegalMove(p1, p2)) {
			return false;
		}else if(p1.px == p2.px || p1.py == p2.py) {
			return true;
		}
		return false;
	}
	
}
