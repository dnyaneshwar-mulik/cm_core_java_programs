package multithreadsing2.syncBlock;

public class TablePrinting {
	
	public  void printTable(int n) {
		
		System.out.println("Code Befor Sync Block");
		
		synchronized (this) {
			
			for(int i=1; i <= 10; i++) {
				
				System.out.println(n*i);
				
				try {
					
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
		
		System.out.println("Code After Sync Block");
		
		
	}

}
