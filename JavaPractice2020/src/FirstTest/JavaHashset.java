package FirstTest;

import java.util.HashSet;

public class JavaHashset {

	public static void main(String[] args) {
		
		HashSet<Integer> age = new HashSet<Integer>();
		
		age.add(9);
		age.add(14);
		age.add(25);
		age.add(43);
		age.add(43);
		
		System.out.println(age);
System.out.println(age.contains(20));
	}

}
