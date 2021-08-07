package test;

import java.util.Calendar;

public class usgetTime extends getTime{
	usgetTime() {
		if (str.equals("AM")) {
			hour = cal.get(Calendar.HOUR) - 4;
			str = "PM";
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);

			switch (hour) {
			case -4:
				hour = 8;
				break;
			case -3:
				hour = 9;
				break;
			case -2:
				hour = 10;
				break;
			case -1:
				hour = 11;
				break;
			case 0:
				hour = 12;
			}
			watch = (str + " " + hour + " : " + min + " : " + sec + " sec");
		} 
		else if (str.equals("PM")) {
			hour = cal.get(Calendar.HOUR) - 4;
			str = "AM";
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);

			switch (hour) {
			case -4:
				hour = 8;
				break;
			case -3:
				hour = 9;
				break;
			case -2:
				hour = 10;
				break;
			case -1:
				hour = 11;
				break;
			case 0:
				hour = 12;
			}
			watch = (str + " " + hour + " : " + min + " : " + sec + " sec");
		}
	}
}
