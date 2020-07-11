package hw7Q2Polymorphism;

public class Cousin1 {
	
	public void ageOfCousins(int age1, int age2, int age3, String age4) {
		
		int total = age1+age2+age3+ Integer.parseInt(age4); 
		
		System.out.println("the total age :" + total);
				
	}

static int ageOfCousins(int age5, int age6, String age8) {
		
		int total = age5+age6+ Integer.parseInt(age8); 
		
		return total;
		
		
	}
final int ageOfCousins(int age5, int age11, int age12, int age6, String age8) {
	
	int total = age5+age6+age11+age12+ Integer.parseInt(age8); 
	
	return total;
	
	
}


}
