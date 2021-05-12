package pkg1021;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// DecimalFormat : 십진수 서식을 도와주는 유틸리티 클래스
		// # : 숫자 1개를 의미 , 자리수가 남으면 #은 제거 된다.
		// 0 : 숫자 1개를 의미 , 자리수가 남아도 0은 제거되지 않는다.
		// , : 콤마를 의미
		// . : 소수점을 의미
		// % : 백분율을 의미, * 100 한 다음 %

		double su = 1234.56789;

		String pattern = "###,###.00";
		DecimalFormat df1 = new DecimalFormat(pattern);
		String result = df1.format(su);
		System.out.println("결과 01 [" + result + "]");

		pattern = "000,000.00";
		DecimalFormat df2 = new DecimalFormat(pattern);
		result = df2.format(su);
		System.out.println("결과 02 [" + result + "]");

		int su1 = 1234;
		pattern = "000000";
		DecimalFormat df3 = new DecimalFormat(pattern);
		result = df3.format(su1);
		System.out.println("결과 03 [" + result + "]");

		su = 0.257345;
		pattern = "###.00%";
		DecimalFormat df4 = new DecimalFormat(pattern);
		result = df4.format(su);
		System.out.println("결과 04 [" + result + "]");

	}

}
