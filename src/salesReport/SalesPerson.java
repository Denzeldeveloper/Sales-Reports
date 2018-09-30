package salesReport;

public class SalesPerson extends Person
{

	private String address;
	private String employeeId;
	
	public SalesPerson (String name, int day, int month, int year ,String address,String employeeId) 
	{
		super(name, day, month, year);
		
		this.address = address;
		this.employeeId = employeeId;
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return super.toString() + "SalesPerson [address=" + address + ", employeeId=" + employeeId + "]";
	}
	
	
}
