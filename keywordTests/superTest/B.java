package keywordTests.superTest;

public class B extends A {
	
	int a = 20;
	
	public B() {
		//this(20);
		super(10);
		System.out.println("Inside B default Constructor");
	}
	
	public B(int val) {
		super();
		System.out.println("Inside B int constructor-"+val);
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		//obj.m1();
	}
	
	void show() {
		System.out.println("Inside B-show method");
	}
	
	void m1() {
		
		System.out.println(super.a); //20
		
		//A obj1 = new A();
		
		System.out.println(super.a); //10
		
		B obj = new B();
		obj.show();
		
		super.show();
		
	}

}
