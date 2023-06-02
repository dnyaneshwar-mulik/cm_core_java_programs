package oop2.inheritanceTest;

public class SWDeveloper extends Employee {
	
	
	private float bonus;
	
	public float getSWDevSalary() {
		
		return getSalary() + getBonus();
	}
	
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	

}
