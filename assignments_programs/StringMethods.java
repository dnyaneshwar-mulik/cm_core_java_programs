package assignments_programs;

public class StringMethods {
	
	public void stringConcat() {
		
		String s = "CodeMind ";
		
		s = s+"Technology";
		
		System.out.println(s);
		
		String s1 = 40 + 40 +"Umesh"+50 + 20+70;
		
		System.out.println(s1); //80Umesh5020
		
		String s2 = "Umesh ";
		
		 s2 = s2.concat("Bichukale");
		
		System.out.println(s2);
		
	}
	
	public void StringSubString() {
		
		String s = "CodeMind";
		//s = s.substring(4);
		s = s.substring(1, 5);
		System.out.println(s);
		
	}
	
	public void otherMethods() {
		
		String s = "CodeMind Technology";
		//s = s.trim();
		//s = s.toLowerCase();
		//s = s.toUpperCase();
		System.out.println(s.length());
		System.out.println(s.startsWith("Co"));
		System.out.println(s.endsWith("ndd"));
		System.out.println(s.charAt(1));
		
	}
	
	public static void main(String[] args) {
		
		StringMethods obj = new StringMethods();
		//obj.stringConcat();
		//obj.StringSubString();
		obj.otherMethods();
	}

}
