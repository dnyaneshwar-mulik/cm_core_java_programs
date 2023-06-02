package assignments_programs;

class emp {
	String name;
	int mob;
	int sal;

	void empdetail(String n, int m, int s) {
		name = n;
		mob = m;
		sal = s;
	}

	void empdt() {
		System.out.println("in empdata method \nemp name " + name + " mobile= " + mob + " salary= " + sal);
	}
}

public class Main1 {
	public static void main(String[] args) {
		System.out.println("in main method");
		emp obj = new emp();
		obj.empdetail("nytri", 8457965, 40000);
		obj.empdt();
	}
}