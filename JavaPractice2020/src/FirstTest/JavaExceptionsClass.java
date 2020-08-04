package FirstTest;

public class JavaExceptionsClass {

	public static void main(String[] args) {
		
		try {
			int [] ourAges = {9, 14, 43};
			System.out.println(ourAges[5]);
			
		} catch (Exception e) {
			System.out.println("Shamim you did not enter that INDEX in your table");
		} finally {
			System.out.println("Enter that index in your table");
		}

	}

}
