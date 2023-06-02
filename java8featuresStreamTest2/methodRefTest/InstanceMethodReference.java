package java8featuresStreamTest2.methodRefTest;

public class InstanceMethodReference {
	
	public void saySomething() {
		System.out.println("Hello, Welcome to non-static method");
	}
	
	public void sayHello() {
		System.out.println("In Say Hello method");
	}
	
	public static void main(String[] args) {
		
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		
		// Referring static method
		Sayable sayable = instanceMethodReference::saySomething;
		
		// Calling interface method 
		sayable.say();
		
		//Anonymus Object
		
		Sayable sayble1 = new InstanceMethodReference()::saySomething;
		
		sayble1.say();
		
		Sayable sayble2 = new InstanceMethodReference()::sayHello;
		
		sayble2.say();
		
		
		
	}

}
