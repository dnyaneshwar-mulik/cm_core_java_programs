package tryCatch;

public class ArithmeticExceptionTest {
	
	void m1() {
		System.out.println("A-m1 starts");
		try {
			int a = 1/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("In catch block"+e);
		} catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("Aray index exception" +ee);
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("A-m1 ends");
	}
	
	public static void main(String[] args) {
		ArithmeticExceptionTest at = new ArithmeticExceptionTest();
		at.m1();
	}

}
