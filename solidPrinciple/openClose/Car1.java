package solidPrinciple.openClose;

public class Car1 extends VehicleInfo1 {
	
	@Override
	public double vehicleNumber() {
		
		return this.getValue();
	}
	
	public double getValue() {
		
		return 0;
	}

}
