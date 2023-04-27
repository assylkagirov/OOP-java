package lab2problem4;

public class SavingAccount extends Account{

	private double intRate;
	
	public SavingAccount(int a, double intRate) {
		super(a);
		this.intRate = intRate;
		// TODO Auto-generated constructor stub
	}

	public double getIntRate() {
		return intRate;
	}

	public void addInt() {
		deposit(getBalance() * intRate);
	}
	
	public String toString() {
		return super.toString() + " Interest Rate: " + intRate;
	}

}
