package array3;

public class TestEmpArray {
	
	public static void main(String[] args) {
		
		TestEmpArray obj = new TestEmpArray();
		
		Employee[] empArray = obj.addEmpInArray();
		obj.iterateEmpArray(empArray);
		
	}
	
	Employee[] addEmpInArray() {
		
		Employee[] empArray = new Employee[5];
		
		Employee emp1 = new Employee();
		emp1.empId = 1;
		emp1.empName="Umesh";
		emp1.mobNo=7758094241L;
		
		Employee emp2 = new Employee();
		emp2.empId = 2;
		emp2.empName="Ramesh";
		emp2.mobNo=7758094247L;
		
		empArray[0] = emp1;
		empArray[1] = emp2;
		
		return empArray;
	}
	
	void iterateEmpArray(Employee[] array) {
		
		for (Employee employee : array) {
			
			if(employee != null) {
				System.out.println(employee.empId);
				System.out.println(employee.empName);
				System.out.println(employee.mobNo);
			}
		}
		
	}

}
