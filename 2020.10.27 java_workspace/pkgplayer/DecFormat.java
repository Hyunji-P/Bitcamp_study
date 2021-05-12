package pkgplayer;

import java.text.DecimalFormat;

public class DecFormat {

	public static void main(String[] args) {
		// 0:자릿 수
		String pattern = "00";
		// DecimalFormat 숫자형식을 나타내는 클래스
		DecimalFormat df = new DecimalFormat(pattern);
		double su = 12.3456789;
		String result = df.format(su);
		System.out.println(result);

		int su1 = 3;
		result = df.format(su1) + "초";
		System.out.println(result);
	}

}
