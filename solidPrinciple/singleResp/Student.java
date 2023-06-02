package solidPrinciple.singleResp;

//Below code snippet violates the single responsibility principle. 
//To achieve the goal of the principle, we should implement a separate class 
//that performs a single functionality only.

public class Student {
	
	public void printDetails() {
		//functionality of the method  
	}

	public void calculatePercentage() {
		//functionality of the method  
	}

	public void addStudent() {
		//functionality of the method  
	}
}