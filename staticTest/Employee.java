package staticTest;

public class Employee {
	
	int empId = 10;
	
	String empName = "Umesh";
	
	static String companyName = "Infosys";
	
	public static TCSEmployee out = new TCSEmployee();
	
	void getEmployee() {
		System.out.println("Get Employee");
	}
	
	static void display() {
		System.out.println("Display Employee");
	}
	
	public static void main(String[] args) {
		
		System.out.println("In Main Method");
		
		//Employee emp = new Employee();
		Employee.display();
		
	}

}
