package pkg1021;

import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		Scanner scan = null;
		int lotto = 0;

		try {
			scan = new Scanner(System.in);
			System.out.print("�ζ� ��ȣ �Է� : ");
			lotto = scan.nextInt();

			if (lotto < 0 || lotto > 45) {
				String message = "�߸��� �ζ� ��ȣ";
				// ��ü�� ���� throw�ϱ�
				LottoException le = new LottoException(message, lotto);
				throw le;
			} else {
				String imsi = lotto + "��(��) �ùٸ� �ζ� ��ȣ �Դϴ�.";
				System.out.println(imsi);
			}
		} catch (LottoException e) {
			System.out.println("���ڿ� : " + e.toString());
			System.out.println("�޼��� : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("������ ���� �߻�");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
