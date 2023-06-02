package java8featuresStreamTest2.methodRefTest;

public class StaticMethodReference {
	
	public static void saySomething() {
		System.out.println("Hello, Welcome to static method");
	}
	
	public static void main(String[] args) {
		
		// Referring static method
		Sayable sayable = StaticMethodReference::saySomething;
		
		// Calling interface method 
		sayable.say();
		
		
		
	}

}
