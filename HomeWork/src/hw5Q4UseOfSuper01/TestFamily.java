package hw5Q4UseOfSuper01;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n..................................................");
		
		Father father = new Father();
		father.father();
		father.fatherInfo("Johir", 70, 'M', false);
		
		System.out.println("\n..................................................");
		Father father2 = new Father("Gias", 84, 'M', false);
		
		System.out.println("\n..................................................");
		Son son = new Son();
		son.son();
		son.sonInfo(483, 3.678f);
		
		System.out.println("\n..................................................");
		Son son2 = new Son(488, 3.7865f);
	}

}