package solidPrinciple.liskovPrinciple;

public class Engine {
	
	void on() {
		System.out.println("Car started");
	}

	void powerOn(int val) {
		System.out.println("Power is on"+val);
	}
}
