package collectionss.listTest2;

import java.util.ArrayList;

public class ArrayListBasic {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s = new Student();
		s.rno=10;
		s.name = "Umesh";
		
		al.add(s);
		
		//al.add(a);
		//al.add(2);
		//al.add(10.5f);
		//al.add("Umesh");
		
		//System.out.println(al.get(0));
		//System.out.println(al.get(1));
		//System.out.println(al.get(2));
		//System.out.println(al.get(3));
		
		Student obj = al.get(0);
		System.out.println(obj.rno);
		System.out.println(obj.name);
		
	}

}
