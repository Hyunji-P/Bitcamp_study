package pkg0923;

public class LargeTest {

	public static void main(String[] args) {
		int su1 = 105;
		int su2 = 300;
		// �ΰ��� ���� �� ū ���� ����� ������.
		if (su1 > su2) {
			System.out.println(su1);
		} else {
			System.out.println(su2);
		}

		int x = 5, y = 10;
		// x�� y�� ������� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
		if (y % x == 0) {
			System.out.println(x + "��(��) " + y + "�� ����Դϴ�.");
		} else {
			System.out.println(x + "��(��) " + y + "�� ����� �ƴմϴ�.");
		}

		// ����) �̼����� üũ : 19�� �̻��� �����̶�� ����
		// ��� ���� : 13���� 'ȫ�浿'�� "�̼�����"�Դϴ�.
		String name;
		int age;

		name = "ȫ�浿";
		age = 25;

		if (age >= 1 && age < 19) {
			System.out.println(age + "���� \'" + name + "\'�� \"�̼�����\"�Դϴ�.");
		} else {
			System.out.println(age + "���� \'" + name + "\'�� \"����\"�Դϴ�.");
		}

		// ����) su�� 3�� ����̸� �������� , �ƴϸ� ���ϱ� 5�� ����� ����ϼ���.
		int su = 9;

		if (su % 3 == 0) {
			su = su * su;
			System.out.println(su);
		} else {
			su = su + 5;
			System.out.println(su);
		}

	}

}
