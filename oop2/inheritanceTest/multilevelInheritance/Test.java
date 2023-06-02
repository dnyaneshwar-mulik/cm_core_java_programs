package oop2.inheritanceTest.multilevelInheritance;

public class Test {
	
	public static void main(String[] args) {
		
		A aObj = new A();
		
		System.out.println(aObj.a);
		//System.out.println(aObj.b);
		aObj.m1();
		//aObj.m2();
		
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);
		obj.m1();
		obj.m2();
		//obj.m3();
		
		C cObj = new C();
		System.out.println(cObj.a);
		System.out.println(cObj.b);
		System.out.println(cObj.c);
		
		cObj.m1();
		cObj.m2();
		cObj.m3();
	}

}
