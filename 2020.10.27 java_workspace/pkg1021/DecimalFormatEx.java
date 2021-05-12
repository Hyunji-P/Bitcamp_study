package pkg1021;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// DecimalFormat : ������ ������ �����ִ� ��ƿ��Ƽ Ŭ����
		// # : ���� 1���� �ǹ� , �ڸ����� ������ #�� ���� �ȴ�.
		// 0 : ���� 1���� �ǹ� , �ڸ����� ���Ƶ� 0�� ���ŵ��� �ʴ´�.
		// , : �޸��� �ǹ�
		// . : �Ҽ����� �ǹ�
		// % : ������� �ǹ�, * 100 �� ���� %

		double su = 1234.56789;

		String pattern = "###,###.00";
		DecimalFormat df1 = new DecimalFormat(pattern);
		String result = df1.format(su);
		System.out.println("��� 01 [" + result + "]");

		pattern = "000,000.00";
		DecimalFormat df2 = new DecimalFormat(pattern);
		result = df2.format(su);
		System.out.println("��� 02 [" + result + "]");

		int su1 = 1234;
		pattern = "000000";
		DecimalFormat df3 = new DecimalFormat(pattern);
		result = df3.format(su1);
		System.out.println("��� 03 [" + result + "]");

		su = 0.257345;
		pattern = "###.00%";
		DecimalFormat df4 = new DecimalFormat(pattern);
		result = df4.format(su);
		System.out.println("��� 04 [" + result + "]");

	}

}
