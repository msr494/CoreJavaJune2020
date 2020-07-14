package FirstTest;

import java.util.Scanner;

public class ScannerTestClass {

	public static void main(String[] args) {
		
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Type your name");
		
		String userID = scnObj.nextLine();
		
		System.out.println("Your name is :" + userID);
		
	}
	
}
