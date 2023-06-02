package java8features;

@FunctionalInterface
interface SaySomething{
	
	String say(String name);
}

public class TestLambada1Param {
	
	public static void main(String[] args) {
		
		//with bracket to param
		
		SaySomething s = (name) -> {
			
			return "Welcome "+name;
		};
		
		 String res = s.say("Kajal");
		
		System.out.println(res);
		
		//No bractket to one Param
		
		SaySomething s1 = name -> {
			return "Hello "+name;
		};
		
		String res1 = s1.say("Kiran");
		
		System.out.println(res1);
		
		
	}

}
