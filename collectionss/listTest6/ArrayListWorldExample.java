package collectionss.listTest6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWorldExample {
	
	ArrayList<ArrayList<ArrayList<String>>> addCountry() {
		
		ArrayList<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Bombay");
		
		ArrayList<String> gujrat = new ArrayList<>();
		gujrat.add("Ahamadabad");
		gujrat.add("Surat");
		
		ArrayList<ArrayList<String>> India = new ArrayList<>();
		India.add(mh);
		India.add(gujrat);
		
		ArrayList<String> florida = new ArrayList<>();
		florida.add("florida city-1");
		florida.add("florida city-2");
		
		ArrayList<String> alaska = new ArrayList<>();
		alaska.add("alaska city-1");
		alaska.add("alaska city-2");
		
		ArrayList<ArrayList<String>> us = new ArrayList<>();
		us.add(florida);
		us.add(alaska);
		
		ArrayList<ArrayList<ArrayList<String>>> world = new ArrayList<>();
		world.add(India);
		world.add(us);
		
		return world;
		
	}
	
	void displayWorld(ArrayList<ArrayList<ArrayList<String>>> world ) {
		
		Iterator<ArrayList<ArrayList<String>>> ctrItr= world.iterator();
		
		while(ctrItr.hasNext()) {
			ArrayList<ArrayList<String>> ctrList = ctrItr.next();
			
			 Iterator<ArrayList<String>> stItr = ctrList.iterator();
			 
			 while(stItr.hasNext()) {
				 ArrayList<String> stList = stItr.next();
				 
				 Iterator<String> cityItr = stList.iterator();
				 
				 while(cityItr.hasNext()) {
					 
					String city = cityItr.next();
					
					System.out.println(city);
					 
				 }
				 
			 }
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayListWorldExample worldExample = new ArrayListWorldExample();
		ArrayList<ArrayList<ArrayList<String>>> world = worldExample.addCountry();
		worldExample.displayWorld(world);
	}

}
