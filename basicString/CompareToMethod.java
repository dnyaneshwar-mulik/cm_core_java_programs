package basicString;

public class CompareToMethod {
	
	public static void main(String[] args) {
		
		String s = "mj";
		String s1 = "mj";
		String s2 = "ra";
		
		String s3 = "A";
		String s4 = "B";
		
		System.out.println(s4.compareTo(s3)); //=ve value
		
		System.out.println(s.compareTo(s1)); // 0
		System.out.println(s2.compareTo(s)); // +ve value
		System.out.println(s.compareTo(s2)); // -ve value
		
	}

}
