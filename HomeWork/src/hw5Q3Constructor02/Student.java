package hw5Q3Constructor02;

/*
03) (optional) Create a package name "hw5Q3Constructor02" in the HW project. Inside the package, a) Create a class "Student". Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). Declare default constructor and one parameterized constructors. Use only one System.out.println() in each constructor to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true. Also, initialize the parameterized method. Paste your constructor GitHub link below
* */

public class Student {
	public String StName;
	public int stId;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructor of Student class");
	}

	public Student(String stName, int stId, char sex, boolean programmer, float grade) {
		this.StName = stName;
		this.stId = stId;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		System.out.println("Student Name: " + StName + ", ID: " + stId + ", Sex: " + sex + ", Grade:   " + grade+ " and Java Programmer: " + programmer);
	}
	
	public void student(String stName, int stId, char sex, boolean programmer, float grade) {
		this.StName = stName;
		this.stId = stId;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		System.out.println("*Student Name: " + StName + ", *ID: " + stId + ", *Sex: " + sex + ", *Grade:   " + grade+ " and *Java Programmer: " + programmer);
	}

}