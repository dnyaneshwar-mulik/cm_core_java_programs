package polyTest;

public class TestSBI {
	
	public static void main(String[] args) {
		
		//SBIBank sbiObj = new SBIBank();
		//sbiObj.calInterest(5000.50, 4);
		//sbiObj.display();
		
		
		  RBIBank obj = new SBIBank(); 
		  obj.calInterest(5000.50, 4); 
		  obj.display();
		  
		  //SBIBank.val = 40;
		  System.out.println(SBIBank.val);
		 
		
	}

}
