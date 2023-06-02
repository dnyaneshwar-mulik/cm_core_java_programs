package oop2.polyTest;

public class Calculator {
	
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	/*
	 * int add(int a, int b) { int result = a+b; System.out.println(result); }
	 */
	
	void add(int a, int b, int c) {
		int result = a + b+ c;
		System.out.println(result);
	}
	
	void add(float a, int b) {
		 float result = a + b;
		 System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.add(10, 20);
		obj.add(40, 50, 60);
		obj.add(10.2f, 50);
		
		//obj.m1(10, 20);
		//obj.m2(4, 50, 40);
		//obj.m3(10.5f, 4);
		
	}

}
