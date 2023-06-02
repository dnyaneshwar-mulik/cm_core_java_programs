package collectionss.listTest3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(8);
		treeSet.add(7);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(1);
		
		Iterator<Integer> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
