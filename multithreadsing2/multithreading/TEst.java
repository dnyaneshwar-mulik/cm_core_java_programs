package multithreadsing2.multithreading;

public class TEst {
	
	public static void main(String[] args) {
		
		MultiThreading t1 = new MultiThreading();
		MultiThreading t2 = new MultiThreading(); 
		
		t1.start();
		t2.start();
		
		 MultiThreading t3 = new MultiThreading();
		 t2.setPriority(1);
		 t3.setPriority(10);
		t1.start();
		t1.setName("CodeMind-1");
		
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			//We can't start thread twice
			t1.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//t1.run();
		
		  
		 
		  t2.start(); 
		  System.out.println(t2.getPriority());
		  
		 
		 
		  t3.start();
		 System.out.println(t3.getPriority());
		//t2.run();
	}

}
