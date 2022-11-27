package ATM;

public class Main {

	public static void main(String[] args) {
		Bank b1 = new Bank(1001, "Rawalpindi"); //Example Bank
		ATM_Machine m1 = new ATM_Machine("Saddar", b1.getCode()); //Example ATM Machine
		
		AccountHolder person = new AccountHolder("Holder_Name", "3782780000076417", 2110); //Example Person
		CurrentAccount  c1 = new CurrentAccount(98001, 10000); // Example Account
		
		c1.displayBalance();
		c1.withdraw(2000);
		c1.displayBalance();
	}
}
