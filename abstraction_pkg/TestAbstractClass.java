package abstraction_pkg;

public class TestAbstractClass {
	public static void main(String[] args) {
		Language obj = new Marathi();
		System.out.println(obj.get_Language());
		
		Language obj2 = new English();
		System.out.println(obj2.get_Language());
		
	}
}