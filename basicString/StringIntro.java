package basicString;

public class StringIntro{

		String name ;
		public StringIntro(String name) {
			this.name = name;
		}
		public static void main(String[] args) {
			
			String s1 = "Umesh";
			
			//name.concat(" Bichukale");
			
			
			String s2 = new String("Umesh");
			
			String s3 = "Umesh";
			
			boolean result = s1.equals(s2);
			
			System.out.println(" String equal method - "+result);
			
			 //== Comparison Operator
			System.out.println(" == operator String " + (s1 == s3));
			
			//System.out.println(" == operator  " + s1 == s1);
			
			
			StringIntro si = new StringIntro("Umesh");
			
			StringIntro si1 = new StringIntro("Umesh");
			
			boolean obj = si.equals(si1);
			
			System.out.println("Object equal "+obj);
			System.out.println("== operator object " +(si == si1));
			
			
			/*
			 * System.out.println(nameObj);
			 * 
			 * int i =10; i++;
			 * 
			 * System.out.println(i);
			 */
			
		}
}
