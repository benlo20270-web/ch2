public class Time{

	public static void main(String[] args) {
		int hour;
		int minute;
		int second;
		int second_pass;
		int second_remaining;
		double percent_day; 
		int time_from_start;
		hour = 13;
		minute = 31;
		second = 54;
		second_pass = hour * 60 * 60 + minute * 60 + second;
		second_remaining = 86400 - second_pass;
		percent_day = 100 * second_remaining / 86400;
		time_from_start = (hour-12) * 3600 + (minute-31) * 60 + (second-54);
		System.out.print("Seconds Passed: ");
		System.out.println(second_pass);
		System.out.print("Seconds Remaining: ");
		System.out.println(second_remaining);
		System.out.print("Percentage Remaining: ");
		System.out.println(percent_day);
		System.out.print("Time Since Start: ");
		System.out.println(time_from_start);
	}
}
