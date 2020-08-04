package FirstTest;

import java.util.HashMap;

public class JavaHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitalStates = new HashMap<String, String>();
		
		capitalStates.put("Texas", "Austin");
		capitalStates.put("NewYork", "Albany");
		capitalStates.put("California", "Sacramento");
		capitalStates.put("Ohio", "Columbus");
		
		System.out.println(capitalStates);
		
		System.out.println(capitalStates.get("Texas"));
		
		for (String i : capitalStates.keySet()) {
			
			System.out.println(i);
		}
		
		for (String i : capitalStates.keySet()) {
			  System.out.println("State: " + i + " Capital: " + capitalStates.get(i));
			}
	}

}
