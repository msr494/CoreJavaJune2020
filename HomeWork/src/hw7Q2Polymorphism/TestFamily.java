package hw7Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		Cousin1 c1Obj = new Cousin1();
		Cousin2 c2Obj = new Cousin2();
		
		c1Obj.ageOfCousins(10, 20, 30, "40");
		System.out.println(Cousin1.ageOfCousins(12, 15, "25"));
		System.out.println(c1Obj.ageOfCousins(5, 8, 7, 6, "9"));
		
		c2Obj.ageOfCousins(2,4,13, "24");
		System.out.println(Cousin2.ageOfCousins(16, 17, "18"));
	}

}
