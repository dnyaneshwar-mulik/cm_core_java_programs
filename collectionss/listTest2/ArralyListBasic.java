package collectionss.listTest2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArralyListBasic {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(7);
		
		
		System.out.println(al);
		//System.out.println(al.get(2));
		
		for(int z=0; z < al.size(); z++) {
			//System.out.println(al.get(z));
		}
		
		for( int val: al) {
			//System.out.println(val);
		}
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			Integer val = itr.next();
			System.out.println(val);
		}
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		System.out.println(hashSet);
		//System.out.println(hashSet.get);
		
		for(int i=0; i < hashSet.size(); i++) {
			//System.out.println(hashSet.get);
		}
		
		for (Integer val : hashSet) {
			//System.out.println(val);
		}
		
		Iterator<Integer> hsItr = hashSet.iterator();
		while(hsItr.hasNext()) {
			Integer val = hsItr.next();
			
			System.out.println(val);
		}
		
	}

}
