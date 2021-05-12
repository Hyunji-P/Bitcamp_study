package pkg1021;

import java.util.Scanner;

public class ExcepTest02 {

	public static void main(String[] args) {
		Scanner scan = null;

		try {
			scan = new Scanner(System.in);
			System.out.print("ù ��° ���� �Է� : ");
			int x = Integer.parseInt(scan.next());

			System.out.print("�� ��° ���� �Է� : ");
			int y = Integer.parseInt(scan.next());

			System.out.println(x / y);
		} catch (NumberFormatException ex) {
			System.out.println("���ڸ� �Է��� �� �����ϴ�.");
		} catch (ArithmeticException ex) {
			System.out.println("0�� �Է��� �� �����ϴ�.");
		} catch (Exception ex) {
			System.out.println("������ ���� �߻�");
		} finally {
			System.out.println("��ĳ�ʸ� �����մϴ�.");
			scan.close();
		}

	}

}
