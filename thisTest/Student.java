package thisTest;

public class Student extends Object {
	
	int rno;
	String name;
	
	
	public Student(int rno, String name) {
		this();
		System.out.println("Both Param Constructor");
		this.rno = rno;
		this.name = name;
		
	}
	
	public Student() {
		this(10);
		System.out.println("Default Constructor");
	}
	
	Student(int rno){
		System.out.println("Int Constructor");
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		
		//Student obj = new Student();
		//obj.rno = rno;
		
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	void saveStudent() {
		
		printStudent();
		System.out.println("Student save successfully");
		
		
		
	}
	
	void printStudent() {
		
		System.out.println("Print Student");
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student(10, "Umesh");  //Same as this
		
		System.out.println(obj.rno);
		System.out.println(obj.name);
		
		obj.saveStudent();
		
		
	}

}
