package oop2.inheritanceTest.singleInheritance;

class A {
	
	int a = 10;
	
	void m1() {
		System.out.println("Inside A-m1");
	}

}

class B extends A {
	
	int b = 30;
	
	void m2() {
		System.out.println("Inside B-m2");
	}
	
}


public class Test {
	
	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.m1();
		obj.m2();
	}

}
