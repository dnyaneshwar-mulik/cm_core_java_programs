package basicString;

public class EqualOperator {
	
public static void main(String[] args) {
		
		String s = "ABC";
		String s1 = new String("ABC");
		String s2 = "XYZ";
		String s3 = "abc";
		String s4= "ABC";
		
		System.out.println(s==s1); //false
		System.out.println(s==s2); //false
		System.out.println(s==s3); //false
		System.out.println(s==s4); //True
		
		
		
	}


}
