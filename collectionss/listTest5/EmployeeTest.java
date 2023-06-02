package collectionss.listTest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Umesh");
		emp.setAge(30);
		
		Employee emp1 = new Employee();
		emp1.setId(3);
		emp1.setName("Sangram");
		emp1.setAge(21);
		
		list.add(emp);
		list.add(emp1);
		
		Collections.sort(list, new EmpIDSorting());
		
		for (Employee employee : list) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		}
		
		Collections.sort(list, new EmpNameSorting());
		
		for (Employee employee : list) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		}
		
	}

}
