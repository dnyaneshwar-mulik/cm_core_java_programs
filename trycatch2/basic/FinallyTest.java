package trycatch2.basic;

public class FinallyTest {
	
	int m1() {
		
		try {
			
			int a = 5;
			System.out.println("In try block");
			
			return a;
			
		}catch(Exception e) {
			System.out.println("Inside Catch block");
		}finally {
			
			System.out.println("In Finally block");
			
			//return 20;
		}
		
		return 10;
		
	}
	
	public static void main(String[] args) {
		
		FinallyTest obj = new FinallyTest();
		int res = obj.m1();
		System.out.println(res);
		
	}

}
