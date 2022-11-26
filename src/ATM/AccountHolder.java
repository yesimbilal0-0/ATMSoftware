package ATM;

public class AccountHolder {
	private String name;
	private String cardNo;
	private int pin;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getCardNo() { return cardNo; }
	public void setCardNo(String cardNo) { this.cardNo = cardNo; }
	
	public int getPin() { return pin; }
	public void setPin(int pin) { this.pin = pin; }
	
	public AccountHolder() {
		setName("None");
		setCardNo("0000000000000000");
		setPin(0);
	}
	
	public AccountHolder(String name, String cardNo, int pin) {
		setName(name);
		setCardNo(cardNo);
		setPin(pin);
	}
	
	public boolean pinVerification(int pin) {
		if(this.pin == pin)
			return true;
		else
			return false;
	}
}
