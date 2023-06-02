package staticTest;

public class Test {
	
	public static void main(String[] args) {
		
		//System.out.println(Employee.empName);
		
		Employee emp = new Employee();
		
		emp.empId = 20;
		emp.empName = "Ramesh";
		
		Employee emp1 = new Employee();
		emp1.empId = 40;
		emp1.empName = "Rakesh";
		emp1.companyName = "TCS";
		
		System.out.println(emp.empId); //20
		System.out.println(emp.empName); //Rakesh
		System.out.println(emp.companyName);
		
		System.out.println(emp1.empId); //40
		System.out.println(emp1.empName); //Rakesh
		System.out.println(emp1.companyName);
		
		Employee.out.println();
	}

}
