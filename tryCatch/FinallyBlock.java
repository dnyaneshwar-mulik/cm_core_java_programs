package tryCatch;

public class FinallyBlock {
	
	void m1() {
		
		System.out.println("A-m1() start");
		
		try {
			
			int a = 1/0;
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Array Index Exception");
		}
		
		finally {
			System.out.println("In Finally block");
		}
		
		System.out.println("A-m1() end");
	}
	
	public static void main(String[] args) {
		FinallyBlock fb = new FinallyBlock();
		fb.m1();
	}

}
