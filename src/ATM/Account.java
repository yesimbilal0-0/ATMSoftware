package ATM;

public class Account {
	private int number;
	private double balance;
	
	public int getNumber() { return number; }
	public void setNumber(int number) { this.number = number; }
	
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	
	public Account() {
		setNumber(0);
		setBalance(0.0);
	}
	
	public Account(int number, double balance) {
		setNumber(number);
		setBalance(balance);
	}
	
	public void Deposit(double amount) {
			System.out.println("Deposit Successful");
			this.balance += amount;
	}
	
	public void Withdraw(double amount) {
		if(this.getBalance() < amount) {
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("Withdraw Successful");
			this.balance -= amount;
		}
	}
}
