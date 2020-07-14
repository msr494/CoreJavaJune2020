package FirstTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	
	public static void main(String[] args) {
		
		LocalDateTime dateObj = LocalDateTime.now();
		DateTimeFormatter dTObj = DateTimeFormatter.ofPattern("MM-dd-yyyy  HH:mm:ss");
		
		
		System.out.println(dateObj);
		System.out.println(dateObj.format(dTObj));

	}

	
}
