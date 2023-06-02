package trycatch2.basic;

public class Basic {
	
	public static void main(String[] args) {
		
			System.out.println("Welcome to java Exception handling");
			
			int a = 10;
			int b = 0;
			int result = 0;
			
			try {
				Class.forName("");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				//System.exit(0);
				result = a/b;
				
				
			} catch(Exception e) {
				
			} 
			finally {
				System.out.println("Inside Finally block");
			} 

			
			System.out.println(" Result is - "+result);
			
			System.out.println("Rest of the code");
			
			Basic obj = new Basic();
			obj.display();
			
	}
	
	
	void display() {
		
		System.out.println("In Display Method");
		
		String name = null;
		try {
			if(name.equals("Umesh")) {
				System.out.println("Name is matched");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("Rest of the code In display method");
		
	}

}
