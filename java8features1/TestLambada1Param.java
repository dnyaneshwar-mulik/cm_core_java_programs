package java8features1;

@FunctionalInterface
interface SaySomething {
	String say(String name);
}
public class TestLambada1Param {
	public static void main(String[] args) {
		// with bracket to parameter
		SaySomething s = (name) -> {
			return "Welcome " + name;
		};
		System.out.println(s.say("Kajal"));
		// No bracket to one Parameter
		SaySomething s1 = name -> {
			return "Hello " + name;
		};
		System.out.println(s1.say("Kiran"));
	}

}
