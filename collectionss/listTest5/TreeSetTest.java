package collectionss.listTest5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(8);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(3);
	
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
		
		Set<Student> studentsSet = new TreeSet<>();
		
		Student student = new Student();
		student.setRno(9);
		student.setName("Amruta");
		student.setAdd("Pune");
		
		Student student1 = new Student();
		student1.setRno(8);
		student1.setName("Swati");
		student1.setAdd("Gujrat");
		
		studentsSet.add(student);
		studentsSet.add(student1);
		
		for (Student student2 : studentsSet) {
			
			System.out.println(student2.getRno());
			System.out.println(student2.getName());
			System.out.println(student2.getAdd());
			
		}
		
		Map<Student, String> map = new TreeMap<>();
		map.put(student, "StudentValue");
		map.put(student1, "Student1 object");
		
		Set<Student> set= map.keySet();
		Iterator<Student> itr = set.iterator();
		
		while(itr.hasNext()) {
			Student sobj = itr.next();
			String val = map.get(sobj);
			System.out.println(val);
		}
		
		Set<String> strVal = new TreeSet<>();
		strVal.add("amruta");
		strVal.add("Suraj");
		
		for (String string : strVal) {
			System.out.println(string);
		}
	}

}
