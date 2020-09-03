import java.util.HashMap;

public class hashMapPractice {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer>warith=new HashMap<String, Integer>();
		warith.put("ABC", 50);
		warith.put("XYZ", 100);
		warith.put("MNP", 200);
		System.out.println(warith);
		
		System.out.println(warith.get("ABC"));
		
	}
	
	

}
