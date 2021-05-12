package pkg1021;

import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		Scanner scan = null;
		int lotto = 0;

		try {
			scan = new Scanner(System.in);
			System.out.print("로또 번호 입력 : ");
			lotto = scan.nextInt();

			if (lotto < 0 || lotto > 45) {
				String message = "잘못된 로또 번호";
				// 객체를 만들어서 throw하기
				LottoException le = new LottoException(message, lotto);
				throw le;
			} else {
				String imsi = lotto + "은(는) 올바른 로또 번호 입니다.";
				System.out.println(imsi);
			}
		} catch (LottoException e) {
			System.out.println("문자열 : " + e.toString());
			System.out.println("메세지 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("나머지 예외 발생");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
