package assignments_programs;

class B{
	public B() {
		System.out.println("inside B default constructor\n");
	}
	
	public B(int val) {	
		System.out.println("inside B int constructor\n");
	}
}

public class Finalkeyword extends B{
	public Finalkeyword(){
		super(10);
		System.out.println("inside C default constructor\n");
	}
	public Finalkeyword(int val) {
		this();
		System.out.println("inside C int constructor \n");
	}
	static {
		System.out.println("inside static block\n");
	}
	{
		System.out.println("inside non static block\n");
	}

	public static void main(String[] args) {
		System.out.println("main method\n");
		Finalkeyword objFinalkeyword=new Finalkeyword();
		Finalkeyword objFinalkeyword2=new Finalkeyword(10);
	}
}