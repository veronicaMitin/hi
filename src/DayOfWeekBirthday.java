import java.util.Date;
public class DayOfWeekBirthday {
	public static void main(String[] args) {
		Date bDayDate = new Date(109, 9, 14);
		int dayOfWeek = bDayDate.getDay();
		System.out.println(dayOfWeek);
	}
}
