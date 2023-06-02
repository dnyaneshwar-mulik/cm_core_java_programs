package assignments_programs;

class A 
{
	int num = 22;
	static String name = "Name A";
	
	static void display() 
	{
		System.out.println("in A class and display method");
	}
}

public class StaticKeyWordTest 
{
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		System.out.println(A.name);
	
		A.display();
		A objA = new A();

		System.out.println(objA.num);
	}
}
