package polyTest;

public class SBIBank extends RBIBank{
	
	static final int val = 20;
	
	double calInterest(double amount, int duration) {
		double res = amount*duration*8/100;
		System.out.println("Inside SBIBank calInterest" +res);
		return res;
	}

}
