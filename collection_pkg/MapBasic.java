package collection_pkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBasic {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(22, "Swati");
		hm.put(11, "Shreyash");
		hm.put(14, "Kiran");
		hm.put(21, "Sagar");
		
		Set<Integer> key = hm.keySet();
		
		Iterator<Integer> itr = key.iterator();

		while (itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
		}
	}

}
