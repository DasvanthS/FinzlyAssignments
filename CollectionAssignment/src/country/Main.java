package country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		List<District> TNDistricts = new ArrayList<>();
		List<District> KLDistricts = new ArrayList<>();
		
		TNDistricts.add(new District("Ambattur", 600020));
		TNDistricts.add(new District("Thirumangalam", 625706));
		
		KLDistricts.add(new District("Kollam", 691000));
		KLDistricts.add(new District("Muvattupuzha", 686661));
		
		Map<String, List<District>> states = new HashMap<>();
		states.put("TN", TNDistricts);
		states.put("KL", KLDistricts);
		
		Map<String, Map<String, List<District>>> country = new TreeMap<>();
		country.put("India", states);

		System.out.println(country);

	}

}
