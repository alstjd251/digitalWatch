package test;

import java.util.Calendar;

public class kogetTime extends getTime{
	kogetTime(){
		cal = Calendar.getInstance();
		day = cal.get(Calendar.AM_PM);
		min = cal.get(Calendar.MINUTE);
		sec = cal.get(Calendar.SECOND);
		str = day == Calendar.AM ? "AM" : "PM";
		hour = cal.get(Calendar.HOUR);

		if (hour == 0) {
			hour = 12;
		} 
		else {
			hour = cal.get(Calendar.HOUR);
		}
		watch = (str + " " + hour + " : " + min + " : " + sec + " sec");
	}
}
