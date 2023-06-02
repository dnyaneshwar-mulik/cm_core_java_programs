package basicString;

public class StringEqualMethod {
	
	public static void main(String[] args) {
		
		String s = "ABC";
		String s1 = new String("ABC");
		String s2 = "XYZ";
		String s3 = "abc";
		
		System.out.println(s.equals(s1)); //True
		System.out.println(s.equals(s2)); //false
		System.out.println(s.equals(s3)); //false
		System.out.println(s.equalsIgnoreCase(s3)); // True
		
		//char val = 'c';
		
	}

}
