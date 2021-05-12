package pkg1021;

//끝자리가 format 이면 java.text에 들어있음
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTEST {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		String format = "yyyy년 MM月 dd일 hh:mm:ss";

		// DateFormat 과 SimpleDateFormat은 상속 관계
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		String now1 = sdf1.format(date);
		System.out.println(now1);
		
		format = "오늘은 yyyy년 MM월 dd일이고 E요일이며 올해에서 D번째 날이며 , 올해 w번째 주입니다. ";
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String now2 = sdf2.format(date);
		System.out.println(now2);
		
		format = "지금은 hh시 mm분 ss초입니다.";
		SimpleDateFormat sdf3 = new SimpleDateFormat(format);
		String now3 = sdf3.format(date);
		System.out.println(now3);
		

	}

}
