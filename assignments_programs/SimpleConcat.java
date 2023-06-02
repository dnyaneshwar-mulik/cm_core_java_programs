package assignments_programs;

public class SimpleConcat {
	public static void main(String[] args) {
		
		String s1= "Java Concept Of The Day", s2="";
		
		char c;
		
		System.out.println(s1); 
		
		for (int i=0; i<s1.length(); i++)
		{
			c= s1.charAt(i); 
			s2= c+s2; 
		}
		System.out.println(s2);
	}
}