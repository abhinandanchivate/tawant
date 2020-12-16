import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {
		
	LocalDate date = LocalDate.now();
	System.out.println(date.plusMonths(1));
	
	System.out.println(date.format(DateTimeFormatter.ofPattern("dd:MM:uuuu")));
	System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
		
	}
}
