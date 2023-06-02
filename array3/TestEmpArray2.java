package array3;

public class TestEmpArray2 {
	
	public static void main(String[] args) {
		
		TestEmpArray2 obj = new TestEmpArray2();
		
		Employee2[] empArray = obj.addEmpInArray();
		obj.iterateEmpArray(empArray);
		
	}
	
	Employee2[] addEmpInArray() {
		
		Employee2[] empArray = new Employee2[5];
		
		Employee2 emp1 = new Employee2();
		emp1.setEmpId(1);
		emp1.setEmpName("Umesh");
		emp1.setMobNo(7758094241L);
		
		
		Employee2 emp2 = new Employee2();
		emp2.setEmpId(2);
		emp2.setEmpName("Ramesh");
		emp2.setMobNo(7758094247L);
		
		empArray[0] = emp1;
		empArray[1] = emp2;
		
		return empArray;
	}
	
	void iterateEmpArray(Employee2[] array) {
		
		for (Employee2 Employee2 : array) {
			
			if(Employee2 != null) {
				
				System.out.println(Employee2);
				
			}
		}
		
	}

}
