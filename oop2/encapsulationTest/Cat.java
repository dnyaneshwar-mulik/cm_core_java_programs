package oop2.encapsulationTest;

public class Cat {
	
	private int energy = 50;
	private int hungry = 60;
	private int mood = 50;
	
	public void feed() {
		
		energy++;
		hungry--;
		mood++;
		meow();
		
	}
	
	public void sleep() {
		
		energy++;
		hungry++;
		mood++;
	}
	
	public void play() {
		
		energy--;
		hungry++;
		mood++;
		meow();
	}
	
	public void meow() {
		System.out.println("Meow");
	}

	public int getEnergy() {
		return energy;
	}

	public int getHungry() {
		return hungry;
	}

	public int getMood() {
		return mood;
	}

}
