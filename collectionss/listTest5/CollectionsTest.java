package collectionss.listTest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		List<Student> studentsList = new ArrayList<>();
		
		Student student = new Student();
		student.setRno(9);
		student.setName("Amruta");
		student.setAdd("Pune");
		
		Student student1 = new Student();
		student1.setRno(8);
		student1.setName("Swati");
		student1.setAdd("Gujrat");
		
		studentsList.add(student);
		studentsList.add(student1);
		
		Collections.sort(studentsList);
		
		for (Student student2 : studentsList) {
			System.out.println(student2.getRno());
			System.out.println(student2.getName());
			System.out.println(student2.getAdd());
		}
		
		
		List<Integer> al = new ArrayList<>();
		
		al.add(9);
		al.add(7);
		al.add(6);
		
		Collections.sort(al);
		
		for (Integer val : al) {
			System.out.println(val);
		}
		
	}

}
