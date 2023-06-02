package multithreadsing2.syncroniseTest;

public class Thread2 extends Thread{

	TablePrinting tb = new TablePrinting();
	
	
	  public Thread2(TablePrinting tb) { 
		  
		  this.tb=tb;
		  
	  }
	 
	
	
	@Override
	public void run() {
		tb.printTable(10);
	}
	
}
