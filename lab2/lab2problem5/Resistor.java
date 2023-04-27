package lab2problem5;

public class Resistor extends Circuit{

	private double res;
	private double pottentialDiff;
	
	public Resistor() {
	}
	
	public Resistor(double res) {
		this.res = res;
	}
	
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return pottentialDiff;
	}

	@Override
	public void applyPottentialDiff(double V) {
		// TODO Auto-generated method stub
		pottentialDiff = V;
	}

}
