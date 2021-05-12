package pkg19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date() ;
		System.out.println(date);
		
		String format = "hh�� mm�� ss��" ;		
		SimpleDateFormat sdf1 = new SimpleDateFormat(format) ;
		String now = sdf1.format(date) ;
		System.out.println(now);
		
		format = "yyyy�� MM�� dd�� hh:mm:ss "; 
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String curDate = sdf2.format(date) ;		
		System.out.println( curDate ); 

		format = "������ yyyy �� MM�� dd���̰�  E�����̸�" ;
		format += " ���ؿ��� D��° ���̸�, ���� w��° ���Դϴ�."; 
		SimpleDateFormat sdf3 = new SimpleDateFormat(format);
		curDate = sdf3.format(date) ;		
		System.out.println( curDate ); 

		format = "������ hh�� mm�� ss���Դϴ�." ; 
		SimpleDateFormat sdf4 = new SimpleDateFormat(format);
		curDate = sdf4.format(date) ;		
		System.out.println( curDate );
		
	}
}