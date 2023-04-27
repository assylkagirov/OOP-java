package lab2problem4;

public class Account {
	
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0; 
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double sum) {
		balance -= sum;
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public double getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		return "\nAcc number: " + accNumber + "\nBalance: " + balance;
	}
	
	public final void print() {
		System.out.println(toString() + "\n");
	}
}
