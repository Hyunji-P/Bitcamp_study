package pkg1020;

public class StrRev {

	public static void main(String[] args) {
		String str = "korea";

		// 방법 01 : 반복문 사용하기
		String imsi = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			imsi += str.charAt(i);
		}

		System.out.println(imsi.toUpperCase());

		// 방법 02 : StringBuffer 클래스 사용하기
		str = str.toUpperCase(); // 먼저 대문자로 바꾸기

		StringBuffer str01 = new StringBuffer(str);
		System.out.println(str01.reverse());

		// 문제) AeRoK
		imsi = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				imsi += str.charAt(i);
			} else {
				//str.charAt(i) : 반환타입이 char 이기 때문에 String으로 변경해야한다.
				imsi += String.valueOf(str.charAt(i)).toLowerCase();

			}
		}
		System.out.println(imsi);

	}

}
