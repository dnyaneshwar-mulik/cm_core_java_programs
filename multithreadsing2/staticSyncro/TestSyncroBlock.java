package multithreadsing2.staticSyncro;

public class TestSyncroBlock {
	
	public static void main(String[] args) {
		
		TablePrinting obj = new TablePrinting();
		
		TablePrinting obj1 = new TablePrinting();
		
		Thread1 t1=new Thread1(obj);
		
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		Thread1 t3 = new Thread1(obj1);
		Thread2 t4 = new Thread2(obj1);
		
		t3.start();
		t4.start();
		
		
	}

}
