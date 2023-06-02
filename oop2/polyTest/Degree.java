package oop2.polyTest;

public class Degree extends Student {

	String type = "Degree";
	
	void saveStudent(int rollNo, String name, String address, long mobNo) {
		
		System.out.println("Fetch Adhar card details");
		
		System.out.println("Save student details with Adhar card");
		
	}
	
	
	public static void main(String[] args) {
		
		Degree obj = new Degree();
		obj.saveStudent(1, "Suraj", "Pune", 7758094241l);
		
	}
}
