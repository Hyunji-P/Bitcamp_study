package pkgplayer;

import java.text.DecimalFormat;

public class DecFormat {

	public static void main(String[] args) {
		// 0:�ڸ� ��
		String pattern = "00";
		// DecimalFormat ���������� ��Ÿ���� Ŭ����
		DecimalFormat df = new DecimalFormat(pattern);
		double su = 12.3456789;
		String result = df.format(su);
		System.out.println(result);

		int su1 = 3;
		result = df.format(su1) + "��";
		System.out.println(result);
	}

}
