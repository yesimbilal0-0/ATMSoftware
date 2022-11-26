package ATM;

public class Bank {
	private int code;
	private String address;
	
	public int getCode() { return code; }
	public void setCode(int code) { this.code = code; }
	
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	
	public Bank() {
		setCode(0);
		setAddress("None");
	}
	
	public Bank(int code, String address) {
		setCode(code);
		setAddress(address);
	}
	
	public void manage() { }
	
	public void maintain() { }
}