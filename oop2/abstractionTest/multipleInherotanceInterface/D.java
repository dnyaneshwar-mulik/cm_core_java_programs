package oop2.abstractionTest.multipleInherotanceInterface;
interface A {
	
	public abstract void m1();

}
interface B {
	
	public abstract void m1();

}

interface C extends A,B {

}

public class D implements C {

	@Override
	public void m1() {
		System.out.println("In D-M1 method");
		
	}
	
	public static void main(String[] args) {
		
		D obj = new D();
		obj.m1();
		
	}

}
