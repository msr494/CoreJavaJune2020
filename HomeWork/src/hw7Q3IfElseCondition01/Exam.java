package hw7Q3IfElseCondition01;


public class Exam {
	public static void main(String[] args) {
		int marks = 80;
		
		if (marks <0 || marks >100) {
			
			System.out.println("Invalid mark" );
		} else if (marks >=0 && marks <=30) {
			
			System.out.println("Fail");
		} else if (marks >= 31 && marks <=60) {
			System.out.println("Pass");
		} else {
			System.out.println("pass with honors");
		}
		

		
	}
	
}
