package hw4Q4variableAndMethod02;
/*
04) (It's optional for practice.) Create a package name "hw4Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- computerConfiguration and use only one System.out.println(). Use the variables inside sysout. Create another class TestComputer. Create object under main method. Initialize object and method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is  expecting  from the test class. Paste your individual github link below
* */

public class Computer {
	public String Brand;
	public String Model;
	public String operatingStringSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public void computerConfiguration() {
		System.out.println("My Brand: " + Brand + ", Model: " + Model + ", Operating system: " + operatingStringSystem + ", Price: " + price + "$" + " and Made in USA? :" + madeInUsa);
	}

}