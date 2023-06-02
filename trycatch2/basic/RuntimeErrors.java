package trycatch2.basic;

public class RuntimeErrors {
	
	void m1() {
		System.out.println("Inside M1 method");
		//m2();
	}
	
	void m2() {
		
		System.out.println("Inside M2 method");
		m1();
	}
	
	public static void main(String[] args) {
		
		RuntimeErrors obj = new RuntimeErrors();
		obj.m1();
		
	}

}
