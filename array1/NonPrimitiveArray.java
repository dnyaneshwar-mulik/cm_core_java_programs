package array1;

public class NonPrimitiveArray {
	
	public static void main(String[] args) {
		
		int[] rollNoArray = new int[10];

		Student[] stuArray = new Student[10];
		
		Student s = new Student();
		s.rollNo = 10;
		s.name = "Swati";
		
		Student s1 = new Student();
		s1.rollNo = 11;
		s1.name = "Sushma";
		
		stuArray[0] = s;
		stuArray[1] = s1;
		
		stuArray[0] = null;
		
		for(int i = 0; i < stuArray.length; i++) {
			
			Student sObj = stuArray[i];
			
			if(sObj != null) {
				System.out.println(sObj.rollNo);
				System.out.println(sObj.name);
			}
			
			
		}
		
		
	}

}
