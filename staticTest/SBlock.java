package staticTest;

public class SBlock {
	
	//Static Block
	static {
		
		System.out.println("Inside Static block");
		
	}
	
	public SBlock() {
		//System.out.println("Inside Non Static Block");
		System.out.println("Inside Default Conctructor");
	}
	
	public SBlock(int a){
		//System.out.println("Inside Non Static Block");
		System.out.println("Inside int param const");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main method");
		
		SBlock obj = new SBlock();
		
		SBlock obj1 = new SBlock(10);
		
	}
	
	//Non static Block
	{
		System.out.println("Inside Non Static Block");
	}

}
