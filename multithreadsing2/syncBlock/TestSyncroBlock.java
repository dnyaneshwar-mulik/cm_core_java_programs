package multithreadsing2.syncBlock;

public class TestSyncroBlock {
	
	public static void main(String[] args) {
		
		TablePrinting obj = new TablePrinting();
		
		//TablePrinting obj1 = new TablePrinting();
		
		Thread1 t1=new Thread1(obj);
		
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		
	}

}
