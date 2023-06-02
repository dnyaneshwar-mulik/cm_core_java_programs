package solidPrinciple.liskovPrinciple;

public class ElectricCar extends Car{
	
	
	public void turnOnEngine() {
        throw new AssertionError("I don't have engine");
    }
	
	public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }

}
