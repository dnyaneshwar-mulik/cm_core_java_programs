package multithreadsing2.syncroniseTest;

public class TablePrinting {
	
	public synchronized void printTable(int n) {
		
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
