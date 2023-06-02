package polyTest;

public class RBIBank {
	
	double calInterest(double amount, int duration) {
		System.out.println("Inside RBIBank calInterest");
		
		return amount*duration*6/100;
	}
	
	void display() {
		System.out.println("Inside RBIBank display");
	}

}
