package salesReport;

public class JuniorSalesPerson  extends SalesPerson {
	

		private double commission;
		
		public JuniorSalesPerson(String name, int day, int month, int year, String address, String employeeId,double commission)
		{
			
			super(name, day, month, year, address, employeeId );
		
			this.commission = commission = .1;
		}

		public double getCommission() {
			return commission;
		}

		public void setCommission(double commission) {
			this.commission = commission;
		}

		@Override
		public String toString() {
			return super.toString() +  "JuniorSalesPerson  commission=" + commission + "]";
		}

	}


