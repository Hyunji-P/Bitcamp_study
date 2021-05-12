package pkg1020;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "�ҳ�ô� ��� �����ɽ� exid �ɽ�����";

		StringTokenizer str1 = new StringTokenizer(str);
		System.out.println("��ū ���� : " + str1.countTokens());

		while (str1.hasMoreTokens()) {
			String item = str1.nextToken();// ���� ����
			System.out.println(item);

		}
		System.out.println();

		str = "�ҳ�ô�/���/�����ɽ�/exid/�ɽ�����";
		String delim = "/";
		StringTokenizer str2 = new StringTokenizer(str, delim);

		while (str2.hasMoreTokens()) {
			String item = str2.nextToken();// ���� ����
			System.out.println(item);

		}
		System.out.println();

		str = "�ҳ�ô�/���/�����ɽ�/exid/�ɽ�����";
		delim = "/";
		// true : deilmeters + token
		StringTokenizer str3 = new StringTokenizer(str, delim, true);
		System.out.println("��ū ���� : " + str3.countTokens());

		while (str3.hasMoreTokens()) {
			String item = str3.nextToken();// ���� ����
			System.out.println(item);

		}
		System.out.println();

		// ����)

		str = "id=hong&password=1234&address=������";
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
