package oop2.abstractClass;
abstract class A {
	
	public A() {
		
	}
	
	public abstract void m1();
	
	void m2() {
		System.out.println("Inside A-m2 methods");
	}

}

class B extends A{

	@Override
	public void m1() {
		System.out.println("Inside B-m1 method");
		
	}
	
	void m2() {
		System.out.println("Inside B-m2 method");
	}

}


public class Test {
	
	public static void main(String[] args) {
		
		A obj = new B();
		obj.m1();
		obj.m2();
		
	}

}
