package findDay;

import java.time.LocalDate;
import java.util.Calendar;

public class FindDayFourthApproach {
	 public static String findDay(int month, int day, int year) {
	        Calendar c = Calendar.getInstance();
	        c.set(year, month, day);
	        return LocalDate.of(year, month, day).getDayOfWeek().toString();
	    }
}