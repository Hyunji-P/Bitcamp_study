package pkg1019;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println("int 최대 값 : " + Integer.MAX_VALUE);// 정수의 최대값
		System.out.println("int 데이터 크기 : " + (Integer.SIZE / 8) + "바이트");// 비트

		System.out.println("long 최대 값 : " + Long.MAX_VALUE);
		System.out.println("double 최대 값 : " + Double.MAX_VALUE);

		int x = 2147483647;
		System.out.println(++x);

//		int y = 21474836470;(에러)

		int aa = 1234;
		int bb = 5678;
		int cc = 10;

		System.out.println("2진수 : " + Integer.toBinaryString(cc));

		String imsi = Integer.toOctalString(cc);
		System.out.println("8진수 : " + imsi);

		System.out.println("16진수 : " + Integer.toHexString(cc));

		// 숫자를 문자열로 결합
		imsi = "";
		String strA = new String("" + aa);
		// String 클래스는 object 클래스의 tiString 메소드를
		// 미리 오버라이딩 해두었다.(워낙 많이 사용하는 클래스 이기 때문에)
		System.out.println(strA);

		//문자열 뒤집기 ① length() 메소드
		int len = strA.length();
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {
			imsi += strA.charAt(i);// 계속 누적
		}
		System.out.println(imsi);

		// Wrapper 클래스들은 xxx.valueOf() 메소드를 가지고 있다.
		// ex) Integer.valueOf("123") → 문자 "123"을 정수로 변경하여라

		// valueOf() : bb는 int 이기 때문에 문자열로 변경
		String strB = String.valueOf(bb);

		String temp = imsi + strB;
		System.out.println("합친 문자열 : " + temp);

		int result = Integer.sum(10, 20);
		System.out.println(result);

		aa = -10;
		result = Integer.signum(aa);
		System.out.println(result);

		// 코드명 + 단가 + 일련 번호
		String str = "ABC123가가";

		// 단가에 100더하기
		// substring() : 전체에서 일부분 추출
		String code = str.substring(0, 3);
		System.out.println(code);

		// 0부터 3 전까지
		String a = str.substring(3, 6);
		System.out.println(a);

		int b = Integer.valueOf(a);
		b += 100;
		System.out.println(b);

		String sno = str.substring(6);
		// 6부터 끝까지
		// str.substring(3, 6) 와 str.substring(6)는 메소드 오버로딩 관계

		String res = code + String.valueOf(b) + sno;
		System.out.println(res);

	}

}
