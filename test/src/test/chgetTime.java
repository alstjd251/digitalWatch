package test;

import java.util.Calendar;

public class chgetTime extends getTime{
	chgetTime() {
		if (str.equals("AM")) {
			hour = cal.get(Calendar.HOUR) - 1;
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);

			if (hour == -1) {
				str = "PM";
				hour = 11;
				if (hour == 12) {
					str = "AM";
				}
			}
			if(hour == 0) {
				hour = 12;
			}
			watch = (str + " " + hour + " : " + min + " : " + sec + " sec");
		} 
		else if (str.equals("PM")) {
			hour = cal.get(Calendar.HOUR) - 1;
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);

			if (hour == -1) {
				str = "AM";
				hour = 11;
				if (hour == 12) {
					str = "PM";
				}
			}
			if(hour == 0) {
				hour = 12;
			}
			watch = (str + " " + hour + " : " + min + " : " + sec + " sec");
		} 
	}
}
