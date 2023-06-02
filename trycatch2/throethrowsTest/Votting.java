package trycatch2.throethrowsTest;

public class Votting {
	
	void checkEligibility(int age) throws NotEligibleForVotting {
		
		if(age < 18) {
			
			System.out.println("You are not eligible for votting");
			
			throw new NotEligibleForVotting("You are not eligible for Votting");
			
		} else {
			
			System.out.println("You are eligible for Votting");
		}
		
	}
	
	public static void main(String[] args) {
		
		Votting obj = new Votting();
		
		
			
			try {
				obj.checkEligibility(5);
			} catch (NotEligibleForVotting e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
