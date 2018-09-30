package salesReport;

public class SeniorSalesPerson extends SalesPerson {

	
	private double salary;
	private double commission;
	
	public SeniorSalesPerson(String name, int day, int month, int year, String address, String employeeId, double salary ,double commission)
	{
		
		super(name, day, month, year, address, employeeId );
		this.salary = salary = 500;
		this.commission = commission = .2;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return super.toString() +  "SeniorSalesPerson [salary= €" + salary + ", commission=" + commission + "]";
	}

}
