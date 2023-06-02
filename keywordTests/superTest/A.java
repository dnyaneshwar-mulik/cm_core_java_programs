package keywordTests.superTest;

public class A {
	
	int a = 10;
	
	public A() {
		System.out.println("Inside A default constructor");
	}
	
	public A(int val) {
		
		System.out.println("Inside int constructor-"+val);
	}
	void show() {
		System.out.println("Inside A-show() method");
	}

}
