package multithreadsing2.noSyncronise;

public class TablePrinting {
	
	public void printTable(int n) {
		
		for(int i=1; i <= 10; i++) {
			
			System.out.println(n*i);
			
			try {
				
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
