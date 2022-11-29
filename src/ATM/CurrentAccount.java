package ATM;

public class CurrentAccount extends Account{
	public CurrentAccount() {
		super(0, 0);
	}
	
	public CurrentAccount(int number, double balance) {
		super(number, balance);
	}
	
	@Override
	public void deposit(double amount) {
			System.out.println("Deposit Successful");
			super.setBalance(super.getBalance() + amount);
	}
	
	public void withdraw(double amount) {
		if(this.getBalance() < amount) {
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("Withdraw Successful");
			super.setBalance(super.getBalance() - amount);
		}
	}
		
	public void displayBalance() {
		System.out.println("Balance in your Account is:" + super.getBalance());
	}
}
