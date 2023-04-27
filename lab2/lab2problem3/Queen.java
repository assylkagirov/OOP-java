package lab2problem3;

public class Queen extends Piece {

	public Queen() {
	}
	public Queen(Position p1) {
		this.p1 = p1;
	}
	
	public boolean isLegalMove(Position p2) {
		// TODO Auto-generated method stub
		return isLegalMove(this.p1, p2);
	}
	
	public static boolean isLegalMove(Position p1, Position p2) {
		if (!Piece.isLegalMove(p1, p2)) {
			return false;
		}
		else if (Bishop.isLegalMove(p1, p2) || Rook.isLegalMove(p1, p2)) {
			return true;
		}
		return false;
		
	}

}
