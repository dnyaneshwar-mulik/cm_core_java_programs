package assignments_programs;

class Animal{
	protected String type="animal";
}

class Dog extends Animal{
	public String type= "dog";
	public void printType() {
		System.out.println(type);
		System.out.println(super.type);
}
	
	}

public class MainSuper {
	public static void main(String[] args) {
		Dog obj= new Dog();
		obj.printType();
	}

}
