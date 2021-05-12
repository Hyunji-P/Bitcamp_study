package pkg1019;

import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {
		// Calendar 클래스는 추상 클래스이어서, new 키워드 사용이 불가능하다.
		// 객체 생성은 static 메소드인 getInstance() 메소드를 사용해야 한다.
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();

		// Calendar. → 수많은 static final 변수가 나옴(enum 타입으로 만들어 놓은 것)
		// get 메소드 : 지정한 변수의 값을 리턴해줌
		int year = cal.get(Calendar.YEAR);

		// 주의) 월은 0부터 시작하기 때문에 반드시 + 1
		int month = cal.get(Calendar.MONTH) + 1;
		// DAY_OF_MONTH : 월에서 몇일이 지났는지
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int ampm = cal.get(Calendar.AM_PM); // 0은 오전 , 1은 오후
		System.out.println(ampm);

		String sampm = ampm == 1 ? "오후 " : "오전 ";

//		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		String imsi = "지금은 " + year + "년 " + month + "월 ";
		imsi += day + "일";
		imsi += "입니다.";

		String imsi1 = "지금은 " + sampm + hour + "시 " + minute + "분 ";
		imsi1 += second + "초";
		imsi1 += "입니다.";

		System.out.println(imsi);
		System.out.println(imsi1);
	}

}
