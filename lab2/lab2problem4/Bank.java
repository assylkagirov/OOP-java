package lab2problem4;
import java.util.*;


public class Bank {
	Vector<Account> accounts = new Vector<Account>();
	
	{
		accounts = new Vector<Account>();
	}
	
	public Vector<Account> getAccounts() {
		return accounts;
	}
	
	public void update() {
		for (Account i: accounts) {
			if (i instanceof CheckingAccount)
				((CheckingAccount)i).deductFee();
			else if (i instanceof SavingAccount)
				((SavingAccount)i).addInt();
			i.deposit(1000);
		}
	}
	
	public void openAccount(Account i) {
		accounts.add(i);
		System.out.println("Account opened" );
	}
	
	public void closeAccount(Account i) {
		accounts.remove(i);
		System.out.println("Account closed");
	}
	
}
