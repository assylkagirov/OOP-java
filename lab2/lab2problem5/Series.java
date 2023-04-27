package lab2problem5;

public class Series extends Circuit {

	private Circuit res1;
	private Circuit res2;
	double cur;
	
	public Series() {
	}
	
	public Series(Circuit res1, Circuit res2) {
		this.res1 = res1;
		this.res2 = res2;
	}
	
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return res1.getResistance() + res2.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return res1.getPotentialDiff() + res2.getPotentialDiff();
	}

	@Override
	public void applyPottentialDiff(double V) {
		// TODO Auto-generated method stub
		cur = V/getResistance();
		res1.applyPottentialDiff(cur * (res1.getResistance() / getResistance()));
		res2.applyPottentialDiff(cur * (res2.getResistance() / getResistance()));
	}

}
