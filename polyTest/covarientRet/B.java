package polyTest.covarientRet;

public class B extends A {
	
	protected B m1() {
		System.out.println("Inside B m1 method");
		return new B();
	}
	
	public static void main(String[] args) {
		
		A obj = new B();
		obj.m1();
		
	}

}
