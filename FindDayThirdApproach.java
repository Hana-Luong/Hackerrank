package findDay;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FindDayThirdApproach {
	static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY",
			"SATURDAY");

	public static String getDay(String day, String month, String year) {

		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);

		Calendar c = Calendar.getInstance();//learn this
		c.set(y, m - 1, d);					//m-1?

		int p = c.get(Calendar.DAY_OF_WEEK);
		String s = days.get(p - 1);			//don't understand
		return s;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//can I do int here?
		String month = scan.next();
		String day = scan.next();
		String year = scan.next();
		scan.close();

		System.out.println(getDay(day, month, year));

	}
}