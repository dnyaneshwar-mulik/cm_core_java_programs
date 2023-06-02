package multithreadsing2.staticSyncro;

public class TablePrinting {
	
	public synchronized static  void printTable(int n) {
		
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
