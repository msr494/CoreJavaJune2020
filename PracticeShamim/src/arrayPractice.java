
import java.util.ArrayList;
public class arrayPractice {

	
	public static void main(String[] args) {
		
		String[] car = {"Toyota", "Volvo"};
		System.out.println(car[1]);
		
		ArrayList<String>ayat=new ArrayList<String>();
		ayat.add("car");
		ayat.add("home");
		ayat.add("banana");
		System.out.println(ayat);
		System.out.println(ayat.get(1));
		
		
		for (int b=0; b<ayat.size(); b++) {
			
			System.out.println(ayat.get(b));
		}
	}
	
}
