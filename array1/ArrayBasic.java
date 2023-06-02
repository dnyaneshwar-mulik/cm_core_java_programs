package array1;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		int empno = 1;
		int empno1 = 2;
		int empno2 = 3;
		
		int[] empArray = new int[10];
		
		/*empArray[0]= 1;
		empArray[1] = 2;
		empArray[2] = 3;*/
		
		/*
		 * System.out.println(empArray[0]); System.out.println(empArray[1]);
		 * System.out.println(empArray[2]);
		 */
		
		//System.out.println(empArray[3]);
			int empId = 1;
			
		for(int i=0; i < empArray.length; i++) {
			
			empArray[i] = empId;
			
			empId++;
		}
		
		for(int i=0; i <= empArray.length-1; i++ ) {
			
			 int val = empArray[i];
			 
			System.out.println(val);
		}
	}

}
