package lab2problem4;

public class CheckingAccount extends Account {

	private int cnt = -1;
	private static final int freetrans = 1; 
	private static final double costtrans = 0.02;
	
	public CheckingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static int getFreeTransactions() {
		return freetrans;
	}

	public static double getTransactionCost() {
		return costtrans;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		cnt++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		cnt++;
	}
	
	public void deductFee() {
		double sum = 0.0;
		sum = (cnt - freetrans) * costtrans;
		this.withdraw(sum);
	}
	public String toString() {
		return super.toString() + " Transactions num: " + cnt;
	}
	


}
