package hw5Q4UseOfSuper01;

/*
04) Create a package name "hw5Q4UseOfSuper01" in the HW project. Inside the package, a) Create a class, Father. declare some variable Name, age, sex, usCitizen, FamilyName. Declare default and parameterized constructor from first 4 variables. Use FamilyName for super keyword.  Create a regular method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout b) Create a class Son, declare variable Id, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. extends Father by Son. Use super keyword and show all the use of the super keyword in child class and initialize in a TestFamily Class. Paste GitHub link below.
* */

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;
	
	public Father() {
		System.out.println("From default constructor of Father");
	}
	
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(name+"  "+age+"  "+sex+"  "+usCitizen);
	}
	
	public void father() {
		System.out.println("From void method of Father class");
	}
	
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(name+" * "+age+" * "+sex+" * "+usCitizen);
	}

}
