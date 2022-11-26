package ATM;

public class ATM_Machine {
	private String location;
	private int managedBy;
	
	public String getLocation() { return location; }
	public void setLocation(String location) { this.location = location; }
	
	public int getManagedBy() { return managedBy; }
	public void setManagedBy(int managedBy) { this.managedBy = managedBy; }
	
	public ATM_Machine() {
		setLocation("None");
		setManagedBy(0);
	}
	
	public ATM_Machine(String location, int managedBy) {
		setLocation(location);
		setManagedBy(managedBy);
	}
	
	public boolean identifies() {
		return true;
	}
	
	public void transcations() {
		
	}
}
