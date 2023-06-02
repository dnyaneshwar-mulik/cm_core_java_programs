package collection_pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWorldExample {

	Map<String, Map<String, ArrayList<String>>> worldCountryStatesCities() {

		Map<String, Map<String, ArrayList<String>>> world = new HashMap<>();

		Map<String, ArrayList<String>> us = new HashMap<>();
		world.put("\nUS", us);

		ArrayList<String> florida = new ArrayList<>();
		us.put("\nFlorida", florida);
		
		florida.add("florida city-1");
		florida.add("florida city-2");

		ArrayList<String> alaska = new ArrayList<>();
		us.put("\nAlaska", alaska);
		
		alaska.add("alaska city-1");
		alaska.add("alaska city-2");

		Map<String, ArrayList<String>> India = new HashMap<>();
		world.put("\nIndia", India);

		ArrayList<String> mh = new ArrayList<>();
		India.put("\nMaharashtra", mh);
		
		mh.add("Pune");
		mh.add("Bombay");

		ArrayList<String> gujrat = new ArrayList<>();
		India.put("\nGujrat", gujrat);
		
		gujrat.add("Ahamadabad");
		gujrat.add("Surat");

		return world;

	}

	void display(Map<String, Map<String, ArrayList<String>>> world) {

		Set<String> countryKey = world.keySet();
		for (String country : countryKey) {
			System.out.println(country);

			Map<String, ArrayList<String>> statesMap = world.get(country);
			
			Set<String> stateKey = statesMap.keySet();
			for (String states : stateKey) {
				System.out.println(states);

				ArrayList<String> citiesObj = statesMap.get(states);
				for (String citieString: citiesObj) {
					System.out.println(citieString);
				}
			}
		}

	}

	public static void main(String[] args) {
		MapWorldExample worldExample = new MapWorldExample();
		// Map<String, Map<String, ArrayList<String>>> world = worldExample.addCountry();
		worldExample.display(worldExample.worldCountryStatesCities());
	}

}
