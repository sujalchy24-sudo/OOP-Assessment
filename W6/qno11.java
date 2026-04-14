package W6;
import java.util.*;
public class qno11 {
public static void main(String[] args) {
		
		HashMap<String, String>  countryCapitals = new HashMap<>();
		
		countryCapitals.put("Nepal", "Kathmandu");
		countryCapitals.put("India", "New Delhi");
		countryCapitals.put("Afghanistan", "Kabul");
		countryCapitals.put("Germany", "Berlin");
		countryCapitals.put("Great Britain", "London");
		
		System.out.println("Country with Capitals:");
		printMap(countryCapitals);
		
		System.out.println("Capitals only:");
		System.out.println(getCapital(countryCapitals, "Nepal"));
		System.out.println(getCapital(countryCapitals, "Great Britain"));
		
		System.out.println(containsCapital(countryCapitals, "Kathmandu"));
		System.out.println(containsCapital(countryCapitals, "Islamabad"));
		
		for (Map.Entry <String, String> m: countryCapitals.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	}
	public static HashMap<String,String> printMap(HashMap<String,String> countryCapitals){
		
		countryCapitals.forEach((country,capital) -> {
			System.out.println(country + " " + capital);
		});
		return countryCapitals;
		
	}
	
	public static String getCapital(HashMap<String, String> countryCapitals, String country){

		return countryCapitals.get(country);
	}
	
public static boolean containsCapital(HashMap<String,String> countryCapitals, String capital) {
		
		if (countryCapitals.containsValue(capital)) {
			return true;
		}
		else {
			return false;
		}
	}
}
