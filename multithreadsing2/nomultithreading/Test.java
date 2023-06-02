package multithreadsing2.nomultithreading;

public class Test {
	
	public static void main(String[] args) {
		
		TestMultithreading obj = new TestMultithreading();
		
		obj.printNumber("obj");
		
		TestMultithreading obj1= new TestMultithreading();
		obj1.printNumber("obj1");
		
	}

}
