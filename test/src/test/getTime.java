package test;

import java.util.Calendar;

public class getTime {
	String watch;
	Calendar cal;
	int day;
	int hour;
	int min;
	int sec;
	String str = null;
	
	getTime() {
		cal = Calendar.getInstance();
		day = cal.get(Calendar.AM_PM);
		min = cal.get(Calendar.MINUTE);
		sec = cal.get(Calendar.SECOND);
		str = day == Calendar.AM ? "AM" : "PM";
		hour = cal.get(Calendar.HOUR);
		
		if (hour == 0) {
			hour = 12;
		} 
	}
}
