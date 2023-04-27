package lab2problem3;

public class Knight extends Piece{
	
	public Knight() {
	}
	public Knight(Position p1) {
		this.p1 = p1;
	}
	
		//override
	public boolean isLegalMove(Position p2) {
		// TODO Auto-generated method stub
		return isLegalMove(this.p1, p2);
	}
	
	public static boolean isLegalMove(Position p1, Position p2) {
		if(!Piece.isLegalMove(p1, p2)) {
			return false;
		}else if ((Math.abs(p1.px - p2.px) == 2 && Math.abs(p1.py - p2.py) == 1) || (Math.abs(p1.px - p2.px) == 1 && Math.abs(p1.py - p2.py) == 2)) {
			return true;
		}
		return false;
	}

}
