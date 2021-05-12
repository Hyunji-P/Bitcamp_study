package pkg1019;

import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {
		// Calendar Ŭ������ �߻� Ŭ�����̾, new Ű���� ����� �Ұ����ϴ�.
		// ��ü ������ static �޼ҵ��� getInstance() �޼ҵ带 ����ؾ� �Ѵ�.
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();

		// Calendar. �� ������ static final ������ ����(enum Ÿ������ ����� ���� ��)
		// get �޼ҵ� : ������ ������ ���� ��������
		int year = cal.get(Calendar.YEAR);

		// ����) ���� 0���� �����ϱ� ������ �ݵ�� + 1
		int month = cal.get(Calendar.MONTH) + 1;
		// DAY_OF_MONTH : ������ ������ ��������
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int ampm = cal.get(Calendar.AM_PM); // 0�� ���� , 1�� ����
		System.out.println(ampm);

		String sampm = ampm == 1 ? "���� " : "���� ";

//		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		String imsi = "������ " + year + "�� " + month + "�� ";
		imsi += day + "��";
		imsi += "�Դϴ�.";

		String imsi1 = "������ " + sampm + hour + "�� " + minute + "�� ";
		imsi1 += second + "��";
		imsi1 += "�Դϴ�.";

		System.out.println(imsi);
		System.out.println(imsi1);
	}

}
