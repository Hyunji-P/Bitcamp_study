package pkg0923;

public class SeasonTest {

	public static void main(String[] args) {
		// ���� ����ϱ�
		// 9���� "����"�Դϴ�.

		int month = 8;
		String Season = "";

		if (month >= 9 && month <= 11) {
			Season = "����";

		} else if (month >= 12 && month <= 2) {
			Season = "�ܿ�";

		} else if (month >= 3 && month <= 5) {
			Season = "��";

		} else {
			Season = "����";

		}

		System.out.println(month + "���� \"" + Season + "\"�Դϴ�.");

		// switch case�� ���� ����ϱ�
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		default:
			System.out.println("�������� �ʴ� ���Դϴ�.");
			break;
		}

	}
}
