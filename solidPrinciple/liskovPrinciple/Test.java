package solidPrinciple.liskovPrinciple;

public class Test {
	
	public static void main(String[] args) {
		
		//Car car = new Car();
		//PetrolCar car = new PetrolCar();
		ElectricCar car = new ElectricCar();
		
		Engine engine = new Engine();
		car.setEngine(engine);
		
		car.turnOnEngine();
		car.accelerate();
		
		//car.type();
		
	}

}
