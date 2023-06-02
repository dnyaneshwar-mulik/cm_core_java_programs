package multithreadsing2.noSyncronise;

public class TestNoSyncro {
	
	public static void main(String[] args) {
		
		TablePrinting obj = new TablePrinting();
		
		Thread1 t1=new Thread1(obj);
		
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
	}

}
