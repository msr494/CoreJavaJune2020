package hw5Q4UseOfSuper01;

public class Son extends Father{
	public int Id;
	public float grade;
	
	public Son() {
		super("Bill Gates", 75, 'M', true);
		super.father();
		super.fatherInfo("Steve Jobs", 76, 'M', true);
		super.FamilyName = "Sharkar";
		System.out.println("Family name is: "+FamilyName);
		System.out.println("From default constructor of Son class");
	}
	public Son(int id, float grade) {
		super();
		super.father();
		super.fatherInfo("Steve jones", 77, 'M', true);
		super.FamilyName = "Bhuiyan";
		System.out.println("Family name is: "+FamilyName);
		this.Id = id;
		this.grade = grade;
		System.out.println("ID: "+id+" and grade: "+grade);
	}
	
	public void son() {
		super.father();
		super.fatherInfo("Steve joy", 77, 'M', true);
		super.FamilyName = "Chowdhury";
		System.out.println("Family name is: "+FamilyName);
		System.out.println("From void method of Son class");
	}
	
	public void sonInfo(int id, float grade) {
		super.father();
		super.fatherInfo("Steve jeremy", 77, 'M', true);
		super.FamilyName = "Khan";
		System.out.println("Family name is: "+FamilyName);
		this.Id = id;
		this.grade = grade;
		System.out.println("*ID: "+id+" and *grade: "+grade);
	}

}