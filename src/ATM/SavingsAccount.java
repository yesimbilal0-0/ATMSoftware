package ATM;

public class SavingsAccount extends Account{
	public SavingsAccount() {
		super(0, 0);
	}
	
	public SavingsAccount(int number, double balance) {
		super(number, balance);
	}
	
	public void deposit(double amount) {
			System.out.println("Deposit Successful");
			super.setBalance(super.getBalance() + amount);
	}
		
	public void displayBalance() {
		System.out.println("Balance in your Account is:" + super.getBalance());
	}
}
