package array3;

public class FindDuplicate {
	
	public static void main(String[] args) {

		int[] numArray = {2,4,6,8,4,6,10,10};
		
		FindDuplicate obj = new FindDuplicate();
		obj.findDuplicate(numArray);
		
	}
	
	void findDuplicate(int[] arr) {
		
		int[] uniqueElement = new int[arr.length/2];
		int index = 0;
		for(int i=0; i < arr.length; i++) {
			
			int val = arr[i];
			
			for(int j=i+1; j <arr.length; j++) {
				
				int num = arr[j];
				
				if(i != j) {
					if(val == num) {
						uniqueElement[index]=val;
						index++;
					}
				}
			}
			
		}
		
		for (int i : uniqueElement) {
			System.out.println(i);
		}
		
	}

}
