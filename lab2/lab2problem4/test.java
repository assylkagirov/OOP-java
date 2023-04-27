package lab2problem4;

public class test {
	
	public static void main(String[] args) {
			
Bank bank = new Bank();
		
		Account acc1 = new SavingAccount(1, 0.5);
		Account acc2 = new CheckingAccount(2);
		
		bank.openAccount(acc1);
		bank.openAccount(acc2);
		
		acc1.deposit(1000);
		acc1.transfer(100, acc2);
		acc1.transfer(200, acc2);
		bank.update();
		acc1.print();
		acc2.print();
	
	}
	
}
