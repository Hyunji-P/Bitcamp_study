package pkg1021;

//���ڸ��� format �̸� java.text�� �������
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTEST {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		String format = "yyyy�� MM�� dd�� hh:mm:ss";

		// DateFormat �� SimpleDateFormat�� ��� ����
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		String now1 = sdf1.format(date);
		System.out.println(now1);
		
		format = "������ yyyy�� MM�� dd���̰� E�����̸� ���ؿ��� D��° ���̸� , ���� w��° ���Դϴ�. ";
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String now2 = sdf2.format(date);
		System.out.println(now2);
		
		format = "������ hh�� mm�� ss���Դϴ�.";
		SimpleDateFormat sdf3 = new SimpleDateFormat(format);
		String now3 = sdf3.format(date);
		System.out.println(now3);
		

	}

}
