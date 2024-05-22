package logprograms;

import java.util.HashMap;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);

        // Get the set view of mappings
        System.out.println("Set View: " + prices.entrySet());
        System.out.println(prices);
	}

}
