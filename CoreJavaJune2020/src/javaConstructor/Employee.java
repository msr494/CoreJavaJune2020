package javaConstructor;

public class Employee {
								// Global variable or Class variable

	public String EmpName;
	public int empID;
	public char sex;
	public boolean fullTimeEmployee;
	
		// A class can contain one default and multiple parameterized constructor
		// Default constructor
	public Employee() {
		System.out.println("This is defaut constructor is from Employee class");
			
	}
	
	
	public Employee(String EmpName) {   // default constructor declared
	this.EmpName = EmpName; 
	System.out.println("Employee Name: " + EmpName);
	
	}
	
	// Parameterized constructor 01

	public Employee(String EmpName, int Id) {  // Local variable
		this.EmpName = EmpName;
		this.empID = Id;
		System.out.println("Employee Name: " + EmpName + ", Employee ID: " + Id);
	}
	// Parameterized constructor 02

	public Employee (String EmpName, int id, char sex){
		this.EmpName = EmpName;
		this.empID = id;
		this.sex = sex;
		System.out.println("Employee Name: " + EmpName + ", ID: " + id + ", Sex: " + sex);
		
		}
	// Parameterized constructor 03

	public Employee(String EmpName, int Id, char sex, boolean fte) {
		this.EmpName = EmpName;
		this.empID = Id;
		this.sex = sex;
		this.fullTimeEmployee = fte;
		System.out.println( "Employee Name: " + EmpName + ", ID: " + Id + " Sex: " + sex + ", Full time employee: " + fte);
	}
	// Parameterized constructor 04

	public Employee(int Id, char sex, boolean fte, String EmpName) { // Local variable
		this.EmpName = EmpName;
		this.empID = Id;
		this.sex = sex;
		this.fullTimeEmployee = fte;
		System.out.println(
				"Employee Name: " + EmpName + ", ID: " + Id + ", Sex: " + sex + " and Full Time employee? " + fte);
	}
	// Parameterized constructor 05
	
	public Employee(char sex, String empName, int empID,  boolean fullTimeEmployee) {
		this.EmpName = empName;
		this.empID = empID;
		this.sex = sex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println(
				"Employee Name: " + EmpName + ", ID: " + empID + ", Sex: " + sex + " and Full Time employee? " + fullTimeEmployee);
	}
	// we can create parameterized constructor by -- selct variables, right click -- source -- generate constrauctor using fields
		// Choose where you want to create it by choosing insertion point
		//another way from top -- select source
	// method
		public void employee() {
			System.out.println("This method is from Employee class");

		}
	
}
