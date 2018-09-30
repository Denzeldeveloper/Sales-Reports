package salesReport;

public class SalesReport
{

	private String carMake;
	private String carModel;
	private String carReg;
	private String fuleType;
	private String engineSize;
	private String colour;
	private double cost;
	private int salesid;
	public SalesReport(String carMake, String carModel, String carReg, String fuleType, String engineSize,
			String colour, double cost, int salesid) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carReg = carReg;
		this.fuleType = fuleType;
		this.engineSize = engineSize;
		this.colour = colour;
		this.cost = cost;
		this.salesid = salesid;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarReg() {
		return carReg;
	}
	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}
	public String getFuleType() {
		return fuleType;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public String getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	
}

