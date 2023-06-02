package collectionss.listTest3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> adharNo = new LinkedHashSet<>();
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
