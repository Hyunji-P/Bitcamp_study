package pkg1020;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이";

		StringTokenizer str1 = new StringTokenizer(str);
		System.out.println("토큰 개수 : " + str1.countTokens());

		while (str1.hasMoreTokens()) {
			String item = str1.nextToken();// 선입 선출
			System.out.println(item);

		}
		System.out.println();

		str = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
		String delim = "/";
		StringTokenizer str2 = new StringTokenizer(str, delim);

		while (str2.hasMoreTokens()) {
			String item = str2.nextToken();// 선입 선출
			System.out.println(item);

		}
		System.out.println();

		str = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
		delim = "/";
		// true : deilmeters + token
		StringTokenizer str3 = new StringTokenizer(str, delim, true);
		System.out.println("토큰 개수 : " + str3.countTokens());

		while (str3.hasMoreTokens()) {
			String item = str3.nextToken();// 선입 선출
			System.out.println(item);

		}
		System.out.println();

		// 문제)

		str = "id=hong&password=1234&address=공덕동";
		delim = "&";
		StringTokenizer str4 = new StringTokenizer(str, delim);

		int cnt_token = str4.countTokens();

		delim = "=";
		for (int i = 0; i < cnt_token; i++) {
			String item = str4.nextToken();
			StringTokenizer str5 = new StringTokenizer(item, delim);
			while (str5.hasMoreTokens()) {
				String imsi = str5.nextToken();
				System.out.print(imsi + "\t");
			}
			System.out.println();
		}

//		while (str4.hasMoreTokens()) {
//			String item = str4.nextToken();
//			StringTokenizer str5 = new StringTokenizer(item, delim);
//			while (str5.hasMoreTokens()) {
//				String imsi = str5.nextToken();
//				System.out.print(imsi + "\t");
//
//			}
//			System.out.println();
//
//		}
//
//		System.out.println();

	}

}
