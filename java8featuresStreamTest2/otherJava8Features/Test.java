package java8featuresStreamTest2.otherJava8Features;

public interface Test {
	
	void tes();
	
	default void test1() {
		System.out.println("Inside default method");
	}
	
	static void test2() {
		System.out.println("Inside Static method");
	}

	
}
