package oop2.inheritanceTest.hierachicalInhert;
class Father {
	
	int a = 70;
	
	void m1() {
		System.out.println("Inside A-m1");
	}

}
class Child1 extends Father {
	
	int b = 80;
	
	void m2() {
		System.out.println("Inside B-m2");
	}
}
class Child2 extends Father {
	
	int c  = 90;
	
	void m3() {
		System.out.println("In C-m3");
	}

}

public class Test {
	
	public static void main(String[] args) {
		
		Child1 obj1 = new Child1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		obj1.m1();
		obj1.m2();
		
		Child2 obj2 = new Child2();
		System.out.println(obj2.a);
		System.out.println(obj2.c);
		
		obj2.m1();
		obj2.m3();
		
	}

}
