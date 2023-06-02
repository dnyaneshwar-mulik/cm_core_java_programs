package oop2.encapsulationTest;

public class Car {
	
	private int speed;
	private String color;
	private String model;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
		}else {
			System.out.println("Incorrect speed");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		
		this.model = model;
	}
	
}
