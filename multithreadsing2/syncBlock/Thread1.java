package multithreadsing2.syncBlock;

public class Thread1 extends Thread{
	
	TablePrinting tb;
	
	public Thread1(TablePrinting tb) {
		this.tb = tb;
	}

	@Override
	public void run() {
		
		tb.printTable(7);
		
	}
}
