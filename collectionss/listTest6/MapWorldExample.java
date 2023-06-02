package collectionss.listTest6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWorldExample {
	
	Map<String, Map<String, ArrayList<String>>> addCountry() {
		
		ArrayList<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Bombay");
		
		ArrayList<String> gujrat = new ArrayList<>();
		gujrat.add("Ahamadabad");
		gujrat.add("Surat");
		
		Map<String, ArrayList<String>> India = new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Gujrat", gujrat);
		
		ArrayList<String> florida = new ArrayList<>();
		florida.add("florida city-1");
		florida.add("florida city-2");
		
		ArrayList<String> alaska = new ArrayList<>();
		alaska.add("alaska city-1");
		alaska.add("alaska city-2");
		
		Map<String, ArrayList<String>> us = new HashMap<>();
		us.put("Florida", florida);
		us.put("Alaska", alaska);
		
		Map<String, Map<String, ArrayList<String>>> world = new HashMap<>();
		world.put("India", India);
		world.put("US", us);
		
		return world;
		
	}
	
	void display(Map<String, Map<String, ArrayList<String>>> world) {
		
		Set<String> ctryKey = world.keySet();
		
		for (String ctry : ctryKey) {
			System.out.println(ctry);
			
			Map<String, ArrayList<String>> stateMap= world.get(ctry);
			Set<String> stateKey = stateMap.keySet();
			
			for (String state : stateKey) {
				System.out.println(state);
				
				 ArrayList<String> cityList = stateMap.get(state);
				 
				 for (String city : cityList) {
					System.out.println(city);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		MapWorldExample worldExample = new MapWorldExample();
		Map<String, Map<String, ArrayList<String>>> world= worldExample.addCountry();
		
		worldExample.display(world);
	}

}
