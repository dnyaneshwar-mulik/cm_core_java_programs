package solidPrinciple.openClose;

public class VehicleInfo  
{  
	public double vehicleNumber(Vehicle vcl)   
	{  
		if (vcl instanceof Car)   
		{  
			return vcl.getNumber();  
		}	
		if (vcl instanceof Bike)   
		{  
				return vcl.getNumber();  
		}
		if(vcl instanceof Truck) {
			
			return vcl.getNumber();
		}
		
		else {
			return vcl.getNumber();
		}
		
	}  
}