package pkg0922;

public class Test_ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * ��� �����ڷ� �ð� ���ϱ� 4000�ʴ� 1�ð�, 6��, 40���Դϴ�.(8000�� 2�ð� 13�� 20��)) 4000�ʸ� �ð�, ��, �ʸ�
		 * ���Ͽ� ������ִ� ���α׷��� �ۼ��ϼ���.
		 */

		int TIME = 4000; // ��� ����
		int second;
		int minute;
		int hour;

//		hour = TIME / (60 * 60);
//		minute = (TIME % (60 * 60)) / 60;
//		second = (TIME % (60 * 60)) % 60;
		
		hour = TIME / 3600 ; 
		minute = (TIME % 3600) / 60 ; // �ʿ��� �ð��� ���� 
		second = TIME % 60 ;

		System.out.println(TIME + "�ʴ� " + hour + "�ð�, " + minute + "��, " + second + "���Դϴ�.");
	}

}
