package polyTest.covarientRet;

public class A {
	
	 A m1() {
		System.out.println("Inside A m1 method");
		return new A();
	}

}
