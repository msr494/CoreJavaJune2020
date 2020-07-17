package hw7Q4IfElseCondition;

public class Weather {
public static void main(String[] args) {
	int temp = -8;
	
if (temp == 0 ) {
		System.out.println("the temp is Zero");
		
	}  else if (temp >0 && temp %2==1) {
		System.out.println("the temp is positive and odd");
		
	} else if (temp >0 && temp %2== 0) {
		System.out.println("the temp is positive and even");
		
	}
	else if (temp <0 && temp %2== 1) {
		System.out.println("the temp is negative and odd");
		
	}
	else  if (temp <0 && temp %2== 0) {
		System.out.println("the temp is negative and even");
		
	}
}
}
