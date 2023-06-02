package multithreadsing2.deadlockTest;

public class NoDeadlock {
	
public static void main(String[] args) {
		
		final String res1 = "Shailesh";
		final String res2 = "SWapnil";
		
		//Thread t1 tries to lock res1 and then res2
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				
				synchronized(res1) {
					
					System.out.println("Thread t1 - locked res1");
					
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(res2) {
						System.out.println("Thread t1 - locked res2");
					}
					
				}
			}
		};
		
		//t2 Thread tries to lock res2 and then res1
		
		Thread t2 = new Thread(){
			
			@Override
			public void run() {
			
				synchronized (res1) {
					
					System.out.println("Thread 2 - locked res2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (res2) {
						
						System.out.println("Thread 2 - locked res1");
						
					}
				}
				
				
			}
		};
		
		t1.start();
		t2.start();
	}

}
