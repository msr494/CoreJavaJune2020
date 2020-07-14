package FirstTest;

import java.util.ArrayList;

public class JavaArrayListClass {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(9);
		age.add(14);
		age.add(39);
		age.add(43);
		
		System.out.println("Ayat age is: " + age.get(0));
		
		age.set(2, 40);
		System.out.println(age.get(2));
		
		System.out.println(age);
		age.remove(3);
		System.out.println(age);
		
		for (int i = 0; i < age.size(); i++ ) {
			System.out.println(age.get(i));
			
				}
		 for (int i : age) {
			 System.out.println(i);
		 }
		
	}
	
	

}
