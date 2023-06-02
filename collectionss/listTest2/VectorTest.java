package collectionss.listTest2;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		vector.add("Pune");
		vector.add("Bombay");
		
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.println(val);
		}
	}

}
