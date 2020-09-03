package Java;
import java.util.Scanner;
public class StringReverser {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		System.out.println("Please enter your name here: ");
		String name = object.nextLine();
		String reversedName = "";
		for (int i = (name.length() - 1); i >= 0; i--) {
			reversedName = reversedName + name.charAt(i);
		}
		System.out.println(reversedName);

	}

}
