package collection_pkg;

import java.util.ArrayList;

public class TestArraylist {

	public static void main(String[] args) {

		ArrayList<Student> st = new ArrayList<Student>();

		Student sobj = new Student();

		st.add(sobj);
		sobj.rno = 101;
		sobj.name = "abc stud";

		Student getObj = st.get(0);
		System.out.println(getObj.rno);
		System.out.println(getObj.name);
	}

}
