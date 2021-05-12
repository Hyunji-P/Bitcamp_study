package mythread;

import java.text.DecimalFormat;
import java.util.Calendar;

//main 쓰레드가 활용 
public class UserCalender {
	public UserCalender() {
		String pattern = "00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		String sampm = ampm == 0 ? "오전" : "오후";

		String imsi = "현재 시각 :" + sampm + " " + df.format(hour) + "시 ";
		imsi += df.format(minute) + "분 " + df.format(second) + "초";
		
		System.out.println(imsi);
	}

}
