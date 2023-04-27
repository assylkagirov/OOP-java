package lab2problem5;

public class Parallel extends Circuit {
	
	private Circuit res1;
	private Circuit res2;
	
	
	public Parallel() {
	}
	
	public Parallel(Circuit res1, Circuit res2) {
		this.res1 = res1;
		this.res2 = res2;
	}
	
	public double getResistance() {
		// TODO Auto-generated method stub
		return (res1.getResistance() * res2.getResistance()) / (res1.getResistance() + res2.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return res1.getPotentialDiff();
	}

	@Override
	public void applyPottentialDiff(double V) {
		// TODO Auto-generated method stub
		res1.applyPottentialDiff(V);
		res2.applyPottentialDiff(V);
	}

}
