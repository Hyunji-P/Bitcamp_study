package mythread;

import java.text.DecimalFormat;
import java.util.Calendar;

//main �����尡 Ȱ�� 
public class UserCalender {
	public UserCalender() {
		String pattern = "00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		String sampm = ampm == 0 ? "����" : "����";

		String imsi = "���� �ð� :" + sampm + " " + df.format(hour) + "�� ";
		imsi += df.format(minute) + "�� " + df.format(second) + "��";
		
		System.out.println(imsi);
	}

}
