package hw4Q4variableAndMethod02;
/*
04) (It's optional for practice.) Create a package name "hw4Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- computerConfiguration and use only one System.out.println(). Use the variables inside sysout. Create another class TestComputer. Create object under main method. Initialize object and method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is  expecting  from the test class. Paste your individual github link below
* */

public class TestComputer {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.Brand = "Apple";
		comp1.Model = "Macbook Air";
		comp1.operatingStringSystem = "MacOS Mojave";
		comp1.price = 800;
		comp1.madeInUsa = false;
		comp1.computerConfiguration();
		
		Computer comp2 = new Computer();
		comp2.Brand = "Dell";
		comp2.Model = "1079";
		comp2.operatingStringSystem = "Windows";
		comp2.price = 700;
		comp2.madeInUsa = false;
		comp2.computerConfiguration();
		

	}

}