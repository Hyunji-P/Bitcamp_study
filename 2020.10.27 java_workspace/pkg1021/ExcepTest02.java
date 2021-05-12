package pkg1021;

import java.util.Scanner;

public class ExcepTest02 {

	public static void main(String[] args) {
		Scanner scan = null;

		try {
			scan = new Scanner(System.in);
			System.out.print("첫 번째 정수 입력 : ");
			int x = Integer.parseInt(scan.next());

			System.out.print("두 번째 정수 입력 : ");
			int y = Integer.parseInt(scan.next());

			System.out.println(x / y);
		} catch (NumberFormatException ex) {
			System.out.println("문자를 입력할 수 없습니다.");
		} catch (ArithmeticException ex) {
			System.out.println("0을 입력할 수 없습니다.");
		} catch (Exception ex) {
			System.out.println("나머지 예외 발생");
		} finally {
			System.out.println("스캐너를 종료합니다.");
			scan.close();
		}

	}

}
