package pkg19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date() ;
		System.out.println(date);
		
		String format = "hh시 mm분 ss초" ;		
		SimpleDateFormat sdf1 = new SimpleDateFormat(format) ;
		String now = sdf1.format(date) ;
		System.out.println(now);
		
		format = "yyyy년 MM月 dd일 hh:mm:ss "; 
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String curDate = sdf2.format(date) ;		
		System.out.println( curDate ); 

		format = "오늘은 yyyy 년 MM월 dd일이고  E요일이며" ;
		format += " 올해에서 D번째 날이며, 올해 w번째 주입니다."; 
		SimpleDateFormat sdf3 = new SimpleDateFormat(format);
		curDate = sdf3.format(date) ;		
		System.out.println( curDate ); 

		format = "지금은 hh시 mm분 ss초입니다." ; 
		SimpleDateFormat sdf4 = new SimpleDateFormat(format);
		curDate = sdf4.format(date) ;		
		System.out.println( curDate );
		
	}
}