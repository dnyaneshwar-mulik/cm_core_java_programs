package oop2.encapsulationTest;

public class Test {
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		
		//obj.speed = -10;
		obj.setSpeed(-10);
		
		//System.out.println(obj.speed);
		System.out.println(obj.getSpeed());
		
		Cat cObj = new Cat();
		cObj.feed();
		cObj.play();
		cObj.sleep();
		
		System.out.println(cObj.getEnergy());
		System.out.println(cObj.getHungry());
		System.out.println(cObj.getMood());
	}

}
