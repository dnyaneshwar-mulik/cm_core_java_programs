package multithreadsing2.multithreading;

public class MultiThreading extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<100;i++) {
			
			System.out.println(Thread.currentThread().getName() +"-"+i);
			
			System.out.println("Thread priority - "+ Thread.currentThread().getPriority());
			/*
			 * try {
			 * 
			 * Thread.sleep(500);
			 * 
			 * } catch (InterruptedException e) { e.printStackTrace(); }
			 */
		
		}
		
	}
}
