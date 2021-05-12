package pkg1019;

import java.util.Calendar;

class MyTest {

	@Override
	public String toString() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		String imsi = "금일은 " + month + "월 ";
		imsi += day + "일 입니다.";
		return imsi;
	}

}

public class MyTestExam {

	public static void main(String[] args) {
		MyTest obj = new MyTest();
		System.out.println(obj);

	}

}
