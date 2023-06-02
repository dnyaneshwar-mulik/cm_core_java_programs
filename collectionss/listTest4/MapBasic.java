package collectionss.listTest4;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapBasic {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		
		hm.put(10, "Suraj");
		hm.put(22, "Swati");
		hm.put(11, "Shreyash");
		hm.put(14, "Kiran");
		hm.put(10, "Sagar");
		
		String val = hm.get(10);
		String val1 = hm.get(22);
		String val2 = hm.get(11);
		
		//System.out.println(val);
		//System.out.println(val1);
		//System.out.println(val2);
		
		Set<Integer> key = hm.keySet();
		
		Iterator<Integer> itr = key.iterator();
		
		while(itr.hasNext()) {
			
			Integer keyVal = itr.next();
			String mVal = hm.get(keyVal);
			System.out.println(mVal);
			
		}
		
		
	}

}
