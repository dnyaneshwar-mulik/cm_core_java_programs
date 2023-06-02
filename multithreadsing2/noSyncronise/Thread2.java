package multithreadsing2.noSyncronise;

public class Thread2 extends Thread{

	TablePrinting tb;
	
	public Thread2(TablePrinting tb) {
		this.tb=tb;
	}
	
	@Override
	public void run() {
		tb.printTable(10);
	}
	
}
