package pkg1005;

public class AccountMain02_2 {

	public static void main(String[] args) {
		// �迭�� ����Ͽ� �ٽ� Ǯ��
		// �迭 ����
		Account02[] account = new Account02[2];

		// ��ü ����
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account02();

		}
		account[0].name = "��ö��";
		account[0].no = 1234;
		account[0].deposit = 1000;
		
		account[1].name = "�ڿ���";
		account[1].no = 5678;
		account[1].deposit = 2000;

		// ������ ����ϱ�
		for (int i = 0; i < account.length; i++) {
			account[i].Display();
		}
	}

}
