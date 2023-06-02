package collectionss.listTest3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> adharNo = new HashSet<>();
		adharNo.add("4589564525");
		adharNo.add("8956452568");
		adharNo.add("5648952634");
		adharNo.add("4589564525");
		
		Iterator<String> itr= adharNo.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
