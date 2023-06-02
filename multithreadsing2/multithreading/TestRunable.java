package multithreadsing2.multithreading;

public class TestRunable {
	
	public static void main(String[] args) {
		
		RunableThread r1 = new RunableThread();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		RunableThread r2 = new RunableThread();
		Thread t2 = new Thread(r2);
		t2.start();
		
	}

}
