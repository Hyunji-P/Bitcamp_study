package pkg0923;

public class Switch05 {

	public static void main(String[] args) {
		// switch case ���� �ֻ���
		// �ֻ��� ���� ¦������ Ȧ������ �Ǵ�
		// ���� �ٸ� ���� �Է� �� error�̶�� ���

		int su = 7;

		System.out.println("���̽� 01");
		switch (su) {
		case 1:
			System.out.println("Ȧ��");
			break;
		case 2:
			System.out.println("¦��");
			break;
		case 3:
			System.out.println("Ȧ��");
			break;
		case 4:
			System.out.println("¦��");
			break;
		case 5:
			System.out.println("Ȧ��");
			break;
		case 6:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Error");
			break;
		}
		su = 3;
		System.out.println("���̽� 02");
		switch (su) {
		case 1:
		case 3:
		case 5:
			System.out.println("Ȧ��");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
